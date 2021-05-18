package com.velocitypowered.api.kt.event.player

import com.velocitypowered.api.event.player.PreLoginEvent
import com.velocitypowered.api.proxy.connection.InboundConnection

val PreLoginEvent.connection: InboundConnection
  inline get() = connection()

val PreLoginEvent.username: String
  inline get() = username()

var PreLoginEvent.onlineMode: Boolean
  inline get() = onlineMode()
  inline set(value) {
    setOnlineMode(value)
  }
