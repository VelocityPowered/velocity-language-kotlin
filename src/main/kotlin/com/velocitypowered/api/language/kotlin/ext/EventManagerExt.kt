package com.velocitypowered.api.language.kotlin.ext

import com.velocitypowered.api.event.Event
import com.velocitypowered.api.event.EventManager
import com.velocitypowered.api.event.EventTask
import kotlin.coroutines.Continuation
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.coroutines.startCoroutine

/**
 * Registers an event listener for the event [E] for the given [plugin]. The listener will use a suspended
 * coroutine, allowing you to use a coroutine context to process the event in a non-blocking way.
 */
inline fun <reified E : Event> EventManager.on(plugin: Any, crossinline handler: suspend (E) -> Unit) =
    register(plugin, E::class.java) { event ->
        suspended {
            handler(event)
        }
    }

/**
 * Marks the specified function as a suspended function, which uses the event continuation system in Velocity to
 * allow you to process the event in a non-blocking way.
 */
fun suspended(fn: suspend () -> Unit): EventTask {
    return EventTask.withContinuation { continuation ->
        val completion = object : Continuation<Unit> {
            override val context: CoroutineContext
                get() = EmptyCoroutineContext
            override fun resumeWith(result: Result<Unit>) {
                if (result.isFailure) {
                    continuation.resumeWithException(result.exceptionOrNull())
                } else {
                    continuation.resume()
                }
            }
        }
        fn.startCoroutine(completion)
    }
}