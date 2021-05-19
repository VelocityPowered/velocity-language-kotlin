package com.velocitypowered.api.kt.event.lifecycle.network

import com.velocitypowered.api.event.lifecycle.network.ListenerClosedEvent
import com.velocitypowered.api.network.ListenerType
import java.net.SocketAddress

inline val ListenerClosedEvent.address: SocketAddress
  get() = address()

inline val ListenerClosedEvent.type: ListenerType
  get() = type()
