package com.velocitypowered.api.kt.event.lifecycle.network

import com.velocitypowered.api.event.lifecycle.network.ListenerClosedEvent
import com.velocitypowered.api.network.ListenerType
import java.net.SocketAddress

val ListenerClosedEvent.address: SocketAddress
  inline get() = address()

val ListenerClosedEvent.type: ListenerType
  inline get() = type()
