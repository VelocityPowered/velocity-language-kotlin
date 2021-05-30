package com.velocitypowered.api.kt.event

import com.velocitypowered.api.event.ResultedEvent
import net.kyori.adventure.text.Component

inline var <R : ResultedEvent.Result> ResultedEvent<R>.result: R
  get() = result()
  set(value) {
    setResult(value)
  }

inline val ResultedEvent.ComponentResult.reason: Component?
  get() = reason()
