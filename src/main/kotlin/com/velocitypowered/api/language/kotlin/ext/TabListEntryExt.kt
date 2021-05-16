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

var TabListEntry.Builder.tabList: TabList
    get() = throw UnsupportedOperationException("There is no getter in the Velocity API")
    set(value) {
        tabList(value)
    }

var TabListEntry.Builder.profile: GameProfile
    get() = throw UnsupportedOperationException("There is no getter in the Velocity API")
    set(value) {
        profile(value)
    }

var TabListEntry.Builder.displayName: Component?
    get() = throw UnsupportedOperationException("There is no getter in the Velocity API")
    set(value) {
        displayName(value)
    }

var TabListEntry.Builder.latency: Int
    get() = throw UnsupportedOperationException("There is no getter in the Velocity API")
    set(value) {
        latency(value)
    }

var TabListEntry.Builder.gameMode: Int
    get() = throw UnsupportedOperationException("There is no getter in the Velocity API")
    set(value) {
        gameMode(value)
    }

inline fun TabListEntry(builder: TabListEntry.Builder.() -> Unit): TabListEntry =
    TabListEntry.builder().apply(builder).build()