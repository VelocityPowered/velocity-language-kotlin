package com.velocitypowered.api.kt.event.connection

import com.velocitypowered.api.event.connection.ProxyQueryEvent
import com.velocitypowered.api.proxy.server.QueryResponse
import java.net.InetAddress

inline val ProxyQueryEvent.type: ProxyQueryEvent.QueryType
  get() = type()

inline val ProxyQueryEvent.queryingAddress: InetAddress
  get() = queryingAddress()

inline var ProxyQueryEvent.response: QueryResponse
  get() = response()
  set(value) {
    setResponse(value)
  }
