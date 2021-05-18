package com.velocitypowered.api.kt.event.connection

import com.velocitypowered.api.event.connection.ProxyQueryEvent
import com.velocitypowered.api.proxy.server.QueryResponse
import java.net.InetAddress

val ProxyQueryEvent.type: ProxyQueryEvent.QueryType
  inline get() = type()

val ProxyQueryEvent.queryingAddress: InetAddress
  inline get() = queryingAddress()

var ProxyQueryEvent.response: QueryResponse
  inline get() = response()
  inline set(value) {
    setResponse(value)
  }
