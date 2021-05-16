package com.velocitypowered.api.kt.event

import com.google.common.reflect.TypeToken
import com.velocitypowered.api.event.Event
import com.velocitypowered.api.event.EventManager
import com.velocitypowered.api.event.EventTask
import org.slf4j.Logger
import java.lang.reflect.Method
import java.util.function.BiConsumer
import java.util.function.BiFunction
import java.util.function.Function
import java.util.function.Predicate
import kotlin.reflect.jvm.kotlinFunction

/**
 * Registers a kotlin coroutine continuation adapter into the VelocityEventManager. This adds
 * support for suspending event functions.
 */
internal fun EventManager.registerCoroutineContinuationAdapter(logger: Logger) {
  try {
    registerHandlerAdapter(
      name = "kt_suspend",
      filter = filter@ { method ->
        val function = method.kotlinFunction
          ?: return@filter false
        function.isSuspend
      },
      validator = { method, errors ->
        val function = method.kotlinFunction!!
        // parameters includes receiver, but excludes continuation
        if (function.parameters.size != 2) {
          errors.add("function must have a single parameter which is the event type")
        }
        if (function.returnType.classifier != Unit::class) {
          errors.add("function return type must be Unit")
        }
      },
      invokeFunctionType = object : TypeToken<suspend (Any, Event) -> Unit>() {},
      handlerBuilder = { invokeFunction ->
        BiFunction { instance, event ->
          suspendingEventTask {
            invokeFunction(instance, event)
          }
        }
      }
    )
  } catch (ex: UnsupportedOperationException) {
    logger.warn("Suspending event functions will not be supported.", ex)
  }
}

internal fun <F> EventManager.registerHandlerAdapter(
  name: String,
  filter: Predicate<Method>,
  validator: BiConsumer<Method, MutableList<String>>,
  invokeFunctionType: TypeToken<F>,
  handlerBuilder: Function<F, BiFunction<Any, Event, EventTask>>
) {
  try {
    val method = javaClass.getMethod("registerHandlerAdapter", String::class.java,
      Predicate::class.java, BiConsumer::class.java, TypeToken::class.java, Function::class.java)
    method.invoke(this, name, filter, validator, invokeFunctionType, handlerBuilder)
  } catch (ex: NoSuchMethodException) {
    throw UnsupportedOperationException("The registerHandlerAdapter method couldn't be found"
        + " in VelocityEventManager, handler adapters aren't supported.", ex)
  }
}
