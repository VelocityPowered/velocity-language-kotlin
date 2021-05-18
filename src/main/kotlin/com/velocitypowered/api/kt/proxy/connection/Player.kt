package com.velocitypowered.api.kt.proxy.connection

import com.velocitypowered.api.proxy.connection.Player
import com.velocitypowered.api.proxy.connection.ServerConnection
import com.velocitypowered.api.proxy.player.ClientSettings
import com.velocitypowered.api.proxy.player.ConnectionRequestBuilder
import com.velocitypowered.api.proxy.player.TabList
import com.velocitypowered.api.proxy.server.RegisteredServer
import com.velocitypowered.api.util.GameProfile
import com.velocitypowered.api.util.ModInfo
import kotlinx.coroutines.future.await
import java.util.UUID

val Player.uniqueId: UUID
  inline get() = id()

val Player.username: String
  inline get() = username()

val Player.connectedServer: ServerConnection?
  inline get() = connectedServer()

val Player.clientSettings: ClientSettings
  inline get() = clientSettings()

val Player.modInfo: ModInfo?
  inline get() = modInfo()

val Player.ping: Long
  inline get() = ping()

val Player.onlineMode: Boolean
  inline get() = onlineMode()

var Player.gameProfileProperties: Collection<GameProfile.Property>
  inline get() = gameProfile().properties()
  inline set(value) {
    setGameProfileProperties(value.toList())
  }

val Player.gameProfile: GameProfile
  inline get() = gameProfile()

val Player.tabList: TabList
  inline get() = tabList()

suspend fun Player.connectTo(server: RegisteredServer): ConnectionRequestBuilder.Result =
  createConnectionRequest(server).connect().await()
