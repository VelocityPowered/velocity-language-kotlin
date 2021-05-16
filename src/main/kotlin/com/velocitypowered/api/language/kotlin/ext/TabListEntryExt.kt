package com.velocitypowered.api.language.kotlin.ext

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

inline fun TabListEntry.Builder.tabList(builder: TabListEntry.Builder.() -> TabList) = apply {
    tabList(builder())
}

inline fun TabListEntry.Builder.profile(builder: TabListEntry.Builder.() -> GameProfile) = apply {
    profile(builder())
}

inline fun TabListEntry.Builder.displayName(builder: TabListEntry.Builder.() -> Component?) = apply {
    displayName(builder())
}

inline fun TabListEntry.Builder.latency(builder: TabListEntry.Builder.() -> Int) = apply {
    latency(builder())
}

inline fun TabListEntry.Builder.gameMode(builder: TabListEntry.Builder.() -> Int) = apply {
    gameMode(builder())
}

inline fun TabListEntry(builder: TabListEntry.Builder.() -> Unit): TabListEntry =
    TabListEntry.builder().apply(builder).build()
