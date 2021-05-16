package com.velocitypowered.api.language.kotlin.ext

import com.velocitypowered.api.proxy.player.TabList
import com.velocitypowered.api.proxy.player.TabListEntry
import com.velocitypowered.api.util.GameProfile
import net.kyori.adventure.text.Component
import java.lang.invoke.MethodHandles

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

private val tabListVarHandle =
    MethodHandles.lookup().findVarHandle(TabListEntry.Builder::class.java, "tabList", TabList::class.java)

private val profileVarHandle =
    MethodHandles.lookup().findVarHandle(TabListEntry.Builder::class.java, "profile", GameProfile::class.java)

private val displayNameVarHandle =
    MethodHandles.lookup().findVarHandle(TabListEntry.Builder::class.java, "displayName", Component::class.java)

private val latencyVarHandle =
    MethodHandles.lookup().findVarHandle(TabListEntry.Builder::class.java, "latency", Int::class.java)

private val gameModeVarHandle =
    MethodHandles.lookup().findVarHandle(TabListEntry.Builder::class.java, "gameMode", Int::class.java)

var TabListEntry.Builder.tabList: TabList?
    get() = tabListVarHandle[this] as? TabList
    set(value) {
        tabList(value)
    }

var TabListEntry.Builder.profile: GameProfile?
    get() = profileVarHandle[this] as? GameProfile
    set(value) {
        profile(value)
    }

var TabListEntry.Builder.displayName: Component?
    get() = displayNameVarHandle[this] as Component?
    inline set(value) {
        displayName(value)
    }

var TabListEntry.Builder.latency: Int
    get() = latencyVarHandle[this] as? Int ?: 0
    inline set(value) {
        latency(value)
    }

var TabListEntry.Builder.gameMode: Int
    get() = gameModeVarHandle[this] as? Int ?: 0
    inline set(value) {
        gameMode(value)
    }

inline fun TabListEntry(builder: TabListEntry.Builder.() -> Unit): TabListEntry =
    TabListEntry.builder().apply(builder).build()
