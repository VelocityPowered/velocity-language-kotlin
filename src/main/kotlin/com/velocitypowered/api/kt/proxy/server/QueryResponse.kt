package com.velocitypowered.api.kt.proxy.server

import com.velocitypowered.api.proxy.server.QueryResponse

val QueryResponse.hostname: String
  inline get() = hostname()

val QueryResponse.gameVersion: String
  inline get() = gameVersion()

val QueryResponse.mapName: String
  inline get() = mapName()

val QueryResponse.onlinePlayers: Int
  inline get() = onlinePlayers()

val QueryResponse.maxPlayers: Int
  inline get() = maxPlayers()

val QueryResponse.proxyHost: String
  inline get() = proxyHost()

val QueryResponse.proxyPort: Int
  inline get() = proxyPort()

val QueryResponse.players: Collection<String>
  inline get() = players()

val QueryResponse.proxyVersion: String
  inline get() = proxyVersion()

val QueryResponse.plugins: Collection<QueryResponse.PluginInformation>
  inline get() = plugins()

inline fun QueryResponse(builder: QueryResponse.Builder.() -> Unit): QueryResponse =
  QueryResponse.builder().apply(builder).build()

operator fun QueryResponse.PluginInformation.component1(): String = name
operator fun QueryResponse.PluginInformation.component2(): String? = version
