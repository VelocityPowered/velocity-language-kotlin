package com.velocitypowered.api.kt.event

import com.velocitypowered.api.event.ResultedEvent
import net.kyori.adventure.text.Component

var <R : ResultedEvent.Result> ResultedEvent<R>.result: R
  inline get() = result()
  inline set(value) {
    setResult(value)
  }

val ResultedEvent.ComponentResult.reason: Component?
  inline get() = reason()
