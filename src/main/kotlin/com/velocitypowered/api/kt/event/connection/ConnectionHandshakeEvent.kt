package com.velocitypowered.api.kt.event.connection

import com.velocitypowered.api.event.connection.ConnectionHandshakeEvent
import com.velocitypowered.api.proxy.connection.InboundConnection
import java.net.SocketAddress

val ConnectionHandshakeEvent.connection: InboundConnection
  inline get() = connection()

var ConnectionHandshakeEvent.currentHostname: String
  inline get() = currentHostname()
  inline set(value) {
    setCurrentHostname(value)
  }

val ConnectionHandshakeEvent.originalHostname: String
  inline get() = originalHostname()

var ConnectionHandshakeEvent.currentRemoteHostAddress: SocketAddress?
  inline get() = currentRemoteHostAddress()
  inline set(value) {
    setCurrentRemoteHostAddress(value)
  }

