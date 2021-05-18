package com.velocitypowered.api.kt.event.lifecycle.network

import com.velocitypowered.api.event.lifecycle.network.ListenerBoundEvent
import com.velocitypowered.api.network.ListenerType
import java.net.SocketAddress

val ListenerBoundEvent.address: SocketAddress
  inline get() = address()

val ListenerBoundEvent.type: ListenerType
  inline get() = type()
