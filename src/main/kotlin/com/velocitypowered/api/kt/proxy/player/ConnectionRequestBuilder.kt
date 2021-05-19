package com.velocitypowered.api.kt.proxy.player

import com.velocitypowered.api.proxy.player.ConnectionRequestBuilder
import com.velocitypowered.api.proxy.server.RegisteredServer
import net.kyori.adventure.text.Component

inline val ConnectionRequestBuilder.target: RegisteredServer
  get() = target()

inline val ConnectionRequestBuilder.Result.status: ConnectionRequestBuilder.Status
  get() = status()

inline val ConnectionRequestBuilder.Result.failureReason: Component?
  get() = failureReason()

inline val ConnectionRequestBuilder.Result.finalTarget: RegisteredServer
  get() = finalTarget()
