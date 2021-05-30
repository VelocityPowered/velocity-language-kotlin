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

inline val Player.uniqueId: UUID
  get() = id()

inline val Player.username: String
  get() = username()

inline val Player.connectedServer: ServerConnection?
  get() = connectedServer()

inline val Player.clientSettings: ClientSettings
  get() = clientSettings()

inline val Player.modInfo: ModInfo?
  get() = modInfo()

inline val Player.ping: Long
  get() = ping()

inline val Player.onlineMode: Boolean
  get() = onlineMode()

inline var Player.gameProfileProperties: Collection<GameProfile.Property>
  get() = gameProfile().properties()
  set(value) {
    setGameProfileProperties(value.toList())
  }

inline val Player.gameProfile: GameProfile
  get() = gameProfile()

inline val Player.tabList: TabList
  get() = tabList()

suspend fun Player.connectTo(server: RegisteredServer): ConnectionRequestBuilder.Result =
  createConnectionRequest(server).connect().await()
