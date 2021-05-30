package com.velocitypowered.api.kt.event.connection

import com.velocitypowered.api.event.connection.ProxyPingEvent
import com.velocitypowered.api.proxy.connection.InboundConnection
import com.velocitypowered.api.proxy.server.ServerPing

inline val ProxyPingEvent.connection: InboundConnection
  get() = connection()

inline var ProxyPingEvent.ping: ServerPing
  get() = ping()
  set(value) {
    setPing(value)
  }
