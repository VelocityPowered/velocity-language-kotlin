package com.velocitypowered.api.kt.event.player

import com.velocitypowered.api.event.player.PreLoginEvent
import com.velocitypowered.api.proxy.connection.InboundConnection

inline val PreLoginEvent.connection: InboundConnection
  get() = connection()

inline val PreLoginEvent.username: String
  get() = username()

inline var PreLoginEvent.onlineMode: Boolean
  get() = onlineMode()
  set(value) {
    setOnlineMode(value)
  }
