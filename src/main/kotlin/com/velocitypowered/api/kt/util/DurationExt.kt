package com.velocitypowered.api.kt.util

import java.time.Duration
import kotlin.time.ExperimentalTime
import kotlin.time.Duration as KDuration

fun Duration.ofTicks(ticks: Long): Duration =
  Duration.ofMillis(50 * ticks)

@ExperimentalTime
fun KDuration.Companion.ticks(ticks: Long): KDuration =
  milliseconds(50 * ticks)

