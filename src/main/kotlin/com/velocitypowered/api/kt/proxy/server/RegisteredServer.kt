package com.velocitypowered.api.kt.proxy.server

import com.velocitypowered.api.proxy.connection.Player
import com.velocitypowered.api.proxy.server.RegisteredServer
import com.velocitypowered.api.proxy.server.ServerInfo

val RegisteredServer.serverInfo: ServerInfo
  inline get() = serverInfo()

val RegisteredServer.connectedPlayers: Collection<Player>
  inline get() = connectedPlayers()
