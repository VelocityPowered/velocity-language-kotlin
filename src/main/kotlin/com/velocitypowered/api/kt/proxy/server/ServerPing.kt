package com.velocitypowered.api.kt.proxy.server

import com.velocitypowered.api.proxy.server.ServerPing
import com.velocitypowered.api.util.Favicon
import com.velocitypowered.api.util.ModInfo
import net.kyori.adventure.text.Component
import java.util.UUID

val ServerPing.version: ServerPing.Version
  inline get() = version()

val ServerPing.players: ServerPing.Players?
  inline get() = players()

val ServerPing.description: Component
  inline get() = description()

val ServerPing.favicon: Favicon?
  inline get() = favicon()

val ServerPing.modInfo: ModInfo?
  inline get() = modInfo()

fun ServerPing(builder: ServerPing.Builder.() -> Unit): ServerPing =
  ServerPing.builder().apply(builder).build()

val ServerPing.Version.protocol: Int
  inline get() = protocol()

val ServerPing.Version.name: String
  inline get() = name()

operator fun ServerPing.Version.component1(): Int = protocol
operator fun ServerPing.Version.component2(): String = name

val ServerPing.Players.online: Int
  inline get() = online()

val ServerPing.Players.max: Int
  inline get() = maximum()

val ServerPing.Players.sample: Collection<ServerPing.SamplePlayer>
  inline get() = sample()

operator fun ServerPing.Players.component1(): Int = online
operator fun ServerPing.Players.component2(): Int = max
operator fun ServerPing.Players.component3(): Collection<ServerPing.SamplePlayer> = sample

val ServerPing.SamplePlayer.uniqueId: UUID
  inline get() = id()

val ServerPing.SamplePlayer.name: String
  inline get() = name()

operator fun ServerPing.SamplePlayer.component1(): UUID = uniqueId
operator fun ServerPing.SamplePlayer.component2(): String = name
