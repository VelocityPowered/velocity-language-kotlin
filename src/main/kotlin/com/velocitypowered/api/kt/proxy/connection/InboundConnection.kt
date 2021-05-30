package com.velocitypowered.api.kt.proxy.connection

import com.velocitypowered.api.network.ProtocolVersion
import com.velocitypowered.api.proxy.connection.InboundConnection
import java.net.InetSocketAddress
import java.net.SocketAddress

inline val InboundConnection.remoteAddress: SocketAddress?
  get() = remoteAddress()

inline val InboundConnection.connectedHostname: InetSocketAddress?
  get() = connectedHostname()

inline val InboundConnection.protocolVersion: ProtocolVersion
  get() = protocolVersion()
