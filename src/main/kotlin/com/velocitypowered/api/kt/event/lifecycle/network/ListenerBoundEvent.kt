package com.velocitypowered.api.kt.event.lifecycle.network

import com.velocitypowered.api.event.lifecycle.network.ListenerBoundEvent
import com.velocitypowered.api.network.ListenerType
import java.net.SocketAddress

inline val ListenerBoundEvent.address: SocketAddress
  get() = address()

inline val ListenerBoundEvent.type: ListenerType
  get() = type()
