package com.velocitypowered.api.kt.proxy.server

import com.velocitypowered.api.proxy.server.QueryResponse

inline val QueryResponse.hostname: String
  get() = hostname()

inline val QueryResponse.gameVersion: String
  get() = gameVersion()

inline val QueryResponse.mapName: String
  get() = mapName()

inline val QueryResponse.onlinePlayers: Int
  get() = onlinePlayers()

inline val QueryResponse.maxPlayers: Int
  get() = maxPlayers()

inline val QueryResponse.proxyHost: String
  get() = proxyHost()

inline val QueryResponse.proxyPort: Int
  get() = proxyPort()

inline val QueryResponse.players: Collection<String>
  get() = players()

inline val QueryResponse.proxyVersion: String
  get() = proxyVersion()

inline val QueryResponse.plugins: Collection<QueryResponse.PluginInformation>
  get() = plugins()

inline fun QueryResponse(builder: QueryResponse.Builder.() -> Unit): QueryResponse =
  QueryResponse.builder().apply(builder).build()

operator fun QueryResponse.PluginInformation.component1(): String = name
operator fun QueryResponse.PluginInformation.component2(): String? = version
