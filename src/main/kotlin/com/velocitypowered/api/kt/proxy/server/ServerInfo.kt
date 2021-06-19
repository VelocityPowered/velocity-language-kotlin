package com.velocitypowered.api.kt.proxy.server

import com.velocitypowered.api.proxy.server.ServerInfo
import java.net.InetSocketAddress

operator fun ServerInfo.component1(): String = name
operator fun ServerInfo.component2(): InetSocketAddress = address
