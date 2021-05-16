package com.velocitypowered.api.language.kotlin.ext

import com.velocitypowered.api.proxy.connection.Player
import com.velocitypowered.api.proxy.server.RegisteredServer
import com.velocitypowered.api.proxy.server.ServerInfo
import com.velocitypowered.api.proxy.server.ServerPing
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

val RegisteredServer.serverInfo: ServerInfo
    inline get() = serverInfo()

val RegisteredServer.connectedPlayers: Collection<Player>
    inline get() = connectedPlayers()

suspend inline fun RegisteredServer.suspendPing(): ServerPing = suspendCoroutine { continuation ->
    ping().thenAccept { result ->
        continuation.resume(result)
    }
}
