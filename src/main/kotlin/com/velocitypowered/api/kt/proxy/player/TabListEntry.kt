package com.velocitypowered.api.kt.proxy.player

import com.velocitypowered.api.proxy.player.TabListEntry

inline fun TabListEntry(builder: TabListEntry.Builder.() -> Unit): TabListEntry =
  TabListEntry.builder().apply(builder).build()
