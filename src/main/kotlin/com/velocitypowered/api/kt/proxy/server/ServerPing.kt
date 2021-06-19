package com.velocitypowered.api.kt.proxy.server

import com.velocitypowered.api.proxy.server.ServerPing
import com.velocitypowered.api.util.Favicon
import com.velocitypowered.api.util.ModInfo
import net.kyori.adventure.text.Component
import java.util.UUID

fun ServerPing(builder: ServerPing.Builder.() -> Unit): ServerPing =
  ServerPing.builder().apply(builder).build()

operator fun ServerPing.Version.component1(): Int = protocol
operator fun ServerPing.Version.component2(): String = name

operator fun ServerPing.Players.component1(): Int = online
operator fun ServerPing.Players.component2(): Int = max
operator fun ServerPing.Players.component3(): Collection<ServerPing.SamplePlayer> = sample

operator fun ServerPing.SamplePlayer.component1(): UUID = id
operator fun ServerPing.SamplePlayer.component2(): String = name
