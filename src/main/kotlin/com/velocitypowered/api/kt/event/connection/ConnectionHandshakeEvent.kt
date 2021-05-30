package com.velocitypowered.api.kt.event.connection

import com.velocitypowered.api.event.connection.ConnectionHandshakeEvent
import com.velocitypowered.api.proxy.connection.InboundConnection
import java.net.SocketAddress

inline val ConnectionHandshakeEvent.connection: InboundConnection
  get() = connection()

inline var ConnectionHandshakeEvent.currentHostname: String
  get() = currentHostname()
  set(value) {
    setCurrentHostname(value)
  }

inline val ConnectionHandshakeEvent.originalHostname: String
  get() = originalHostname()

inline var ConnectionHandshakeEvent.currentRemoteHostAddress: SocketAddress?
  get() = currentRemoteHostAddress()
  set(value) {
    setCurrentRemoteHostAddress(value)
  }

