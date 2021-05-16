package com.velocitypowered.api.language.kotlin.ext

import com.velocitypowered.api.proxy.connection.Player
import com.velocitypowered.api.proxy.player.ConnectionRequestBuilder
import com.velocitypowered.api.proxy.server.RegisteredServer
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

suspend fun Player.connect(server: RegisteredServer): ConnectionRequestBuilder.Result =
    suspendCoroutine { continuation ->
        createConnectionRequest(server).connect().thenAccept { result ->
            continuation.resume(result)
        }
    }
