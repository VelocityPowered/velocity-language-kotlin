package com.velocitypowered.api.kt.proxy.player

import com.velocitypowered.api.proxy.player.TabList
import com.velocitypowered.api.proxy.player.TabListEntry
import com.velocitypowered.api.util.GameProfile
import net.kyori.adventure.text.Component

val TabListEntry.parent: TabList
  inline get() = parent()

val TabListEntry.gameProfile: GameProfile
  inline get() = gameProfile()

var TabListEntry.displayName: Component?
  inline get() = displayName()
  inline set(value) {
    setDisplayName(value)
  }

var TabListEntry.ping: Int
  inline get() = ping()
  inline set(value) {
    setPing(value)
  }

var TabListEntry.gameMode: Int
  inline get() = gameMode()
  inline set(value) {
    setGameMode(value)
  }

inline fun TabListEntry(builder: TabListEntry.Builder.() -> Unit): TabListEntry =
  TabListEntry.builder().apply(builder).build()
