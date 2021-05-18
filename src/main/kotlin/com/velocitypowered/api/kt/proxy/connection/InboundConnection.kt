package com.velocitypowered.api.kt.proxy.connection

import com.velocitypowered.api.network.ProtocolVersion
import com.velocitypowered.api.proxy.connection.InboundConnection
import java.net.InetSocketAddress
import java.net.SocketAddress

val InboundConnection.remoteAddress: SocketAddress?
  inline get() = remoteAddress()

val InboundConnection.connectedHostname: InetSocketAddress?
  inline get() = connectedHostname()

val InboundConnection.protocolVersion: ProtocolVersion
  inline get() = protocolVersion()
