package com.velocitypowered.api.kt.proxy.server

import com.velocitypowered.api.proxy.server.ServerPing
import com.velocitypowered.api.util.Favicon
import com.velocitypowered.api.util.ModInfo
import net.kyori.adventure.text.Component
import java.util.UUID

inline val ServerPing.version: ServerPing.Version
  get() = version()

inline val ServerPing.players: ServerPing.Players?
  get() = players()

inline val ServerPing.description: Component
  get() = description()

inline val ServerPing.favicon: Favicon?
  get() = favicon()

inline val ServerPing.modInfo: ModInfo?
  get() = modInfo()

fun ServerPing(builder: ServerPing.Builder.() -> Unit): ServerPing =
  ServerPing.builder().apply(builder).build()

inline val ServerPing.Version.protocol: Int
  get() = protocol()

inline val ServerPing.Version.name: String
  get() = name()

operator fun ServerPing.Version.component1(): Int = protocol
operator fun ServerPing.Version.component2(): String = name

inline val ServerPing.Players.online: Int
  get() = online()

inline val ServerPing.Players.max: Int
  get() = maximum()

inline val ServerPing.Players.sample: Collection<ServerPing.SamplePlayer>
  get() = sample()

operator fun ServerPing.Players.component1(): Int = online
operator fun ServerPing.Players.component2(): Int = max
operator fun ServerPing.Players.component3(): Collection<ServerPing.SamplePlayer> = sample

inline val ServerPing.SamplePlayer.uniqueId: UUID
  get() = id()

inline val ServerPing.SamplePlayer.name: String
  get() = name()

operator fun ServerPing.SamplePlayer.component1(): UUID = uniqueId
operator fun ServerPing.SamplePlayer.component2(): String = name
