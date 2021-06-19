package com.velocitypowered.api.kt.event

import com.velocitypowered.api.event.EventManager
import com.velocitypowered.api.event.EventTask
import com.velocitypowered.api.event.PostOrder
import com.velocitypowered.api.event.Continuation as EventContinuation
import kotlin.coroutines.Continuation
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.coroutines.startCoroutine

/**
 * Registers an event listener for the event [E] for the given [plugin]. The listener will use a
 * suspended coroutine, allowing you to use a coroutine context to process the event in a
 * non-blocking way.
 */
inline fun <reified E : Any> EventManager.on(
  plugin: Any, order: PostOrder = PostOrder.NORMAL, crossinline handler: suspend (E) -> Unit
) =
  register(plugin, E::class.java, order) { event ->
    suspendingEventTask {
      handler(event)
    }
  }

/**
 * Marks the specified function as a suspended function, which uses the event continuation system in
 * Velocity to allow you to process the event in a non-blocking way.
 */
@PublishedApi
internal fun suspendingEventTask(handler: suspend () -> Unit): EventTask =
  EventTask.withContinuation { continuation ->
    handler.startCoroutine(continuation.asCoroutineContinuation())
  }

internal fun EventContinuation.asCoroutineContinuation(): Continuation<Unit> =
  Continuation(EmptyCoroutineContext) { result ->
    if (result.isFailure) {
      resumeWithException(result.exceptionOrNull())
    } else {
      resume()
    }
  }
