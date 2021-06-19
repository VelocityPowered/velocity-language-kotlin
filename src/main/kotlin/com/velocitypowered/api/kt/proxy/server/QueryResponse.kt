package com.velocitypowered.api.kt.proxy.server

import com.velocitypowered.api.proxy.server.QueryResponse

inline fun QueryResponse(builder: QueryResponse.Builder.() -> Unit): QueryResponse =
  QueryResponse.builder().apply(builder).build()

operator fun QueryResponse.PluginInformation.component1(): String = name
operator fun QueryResponse.PluginInformation.component2(): String? = version.orElse(null)
