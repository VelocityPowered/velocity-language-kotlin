package com.velocitypowered.api.kt.scheduler

import com.velocitypowered.api.scheduler.Scheduler
import java.util.concurrent.TimeUnit
import kotlin.time.Duration
import kotlin.time.ExperimentalTime

@ExperimentalTime
fun Scheduler.TaskBuilder.delay(duration: Duration) = apply {
  delay(duration.inWholeMilliseconds, TimeUnit.MILLISECONDS)
}

@ExperimentalTime
fun Scheduler.TaskBuilder.repeat(duration: Duration) = apply {
  repeat(duration.inWholeMilliseconds, TimeUnit.MILLISECONDS)
}
