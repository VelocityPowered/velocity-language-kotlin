package com.velocitypowered.api.kt.event.connection

import com.velocitypowered.api.event.connection.ProxyPingEvent
import com.velocitypowered.api.proxy.connection.InboundConnection
import com.velocitypowered.api.proxy.server.ServerPing

val ProxyPingEvent.connection: InboundConnection
  inline get() = connection()

var ProxyPingEvent.ping: ServerPing
  inline get() = ping()
  inline set(value) {
    setPing(value)
  }
