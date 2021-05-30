package com.velocitypowered.api.kt.proxy.player

import com.velocitypowered.api.proxy.player.TabList
import com.velocitypowered.api.proxy.player.TabListEntry
import com.velocitypowered.api.util.GameProfile
import net.kyori.adventure.text.Component

inline val TabListEntry.parent: TabList
  get() = parent()

inline val TabListEntry.gameProfile: GameProfile
  get() = gameProfile()

inline var TabListEntry.displayName: Component?
  get() = displayName()
  set(value) {
    setDisplayName(value)
  }

inline var TabListEntry.ping: Int
  get() = ping()
  set(value) {
    setPing(value)
  }

inline var TabListEntry.gameMode: Int
  get() = gameMode()
  set(value) {
    setGameMode(value)
  }

inline fun TabListEntry(builder: TabListEntry.Builder.() -> Unit): TabListEntry =
  TabListEntry.builder().apply(builder).build()
