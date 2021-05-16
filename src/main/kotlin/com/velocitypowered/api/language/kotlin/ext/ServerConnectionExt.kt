package com.velocitypowered.api.language.kotlin.ext

import com.velocitypowered.api.proxy.connection.Player
import com.velocitypowered.api.proxy.connection.ServerConnection
import com.velocitypowered.api.proxy.server.RegisteredServer
import com.velocitypowered.api.proxy.server.ServerInfo

val ServerConnection.target: RegisteredServer
    inline get() = target()

val ServerConnection.serverInfo: ServerInfo
    inline get() = serverInfo()

val ServerConnection.player: Player
    inline get() = player()
