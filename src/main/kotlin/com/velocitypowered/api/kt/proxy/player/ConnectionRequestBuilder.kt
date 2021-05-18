package com.velocitypowered.api.kt.proxy.player

import com.velocitypowered.api.proxy.player.ConnectionRequestBuilder
import com.velocitypowered.api.proxy.server.RegisteredServer
import net.kyori.adventure.text.Component

val ConnectionRequestBuilder.target: RegisteredServer
  inline get() = target()

val ConnectionRequestBuilder.Result.status: ConnectionRequestBuilder.Status
  inline get() = status()

val ConnectionRequestBuilder.Result.failureReason: Component?
  inline get() = failureReason()

val ConnectionRequestBuilder.Result.finalTarget: RegisteredServer
  inline get() = finalTarget()
