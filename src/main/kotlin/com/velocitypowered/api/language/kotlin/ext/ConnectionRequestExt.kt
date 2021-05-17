package com.velocitypowered.api.language.kotlin.ext

import com.velocitypowered.api.proxy.connection.Player
import com.velocitypowered.api.proxy.player.ConnectionRequestBuilder
import com.velocitypowered.api.proxy.server.RegisteredServer
import kotlinx.coroutines.future.await

suspend fun Player.connect(server: RegisteredServer): ConnectionRequestBuilder.Result =
    createConnectionRequest(server).connect().await()