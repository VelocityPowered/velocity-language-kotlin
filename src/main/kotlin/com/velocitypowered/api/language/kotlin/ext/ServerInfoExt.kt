package com.velocitypowered.api.language.kotlin.ext

import com.velocitypowered.api.proxy.server.ServerInfo
import java.net.SocketAddress

val ServerInfo.name: String
    inline get() = name()

val ServerInfo.address: SocketAddress
    inline get() = address()

operator fun ServerInfo.component1(): String = name

operator fun ServerInfo.component2(): SocketAddress = address
