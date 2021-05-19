package com.velocitypowered.api.kt.proxy.connection

import com.velocitypowered.api.proxy.connection.Player
import com.velocitypowered.api.proxy.connection.ServerConnection
import com.velocitypowered.api.proxy.server.RegisteredServer
import com.velocitypowered.api.proxy.server.ServerInfo

inline val ServerConnection.target: RegisteredServer
  get() = target()

inline val ServerConnection.serverInfo: ServerInfo
  get() = serverInfo()

inline val ServerConnection.player: Player
  get() = player()
