package com.velocitypowered.api.kt.proxy.server

import com.velocitypowered.api.proxy.connection.Player
import com.velocitypowered.api.proxy.server.RegisteredServer
import com.velocitypowered.api.proxy.server.ServerInfo

inline val RegisteredServer.serverInfo: ServerInfo
  get() = serverInfo()

inline val RegisteredServer.connectedPlayers: Collection<Player>
  get() = connectedPlayers()
