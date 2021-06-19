package com.velocitypowered.api.kt.proxy.player

import com.velocitypowered.api.proxy.player.TabList
import com.velocitypowered.api.proxy.player.TabListEntry
import java.util.UUID

operator fun TabList.plus(entry: TabListEntry): TabList = apply {
  addEntry(entry)
}

operator fun TabList.plusAssign(entry: TabListEntry) {
  addEntry(entry)
}

operator fun TabList.minus(uniqueId: UUID): TabList = apply {
  removeEntry(uniqueId)
}

operator fun TabList.minusAssign(uniqueId: UUID) {
  removeEntry(uniqueId)
}

operator fun TabList.contains(uniqueId: UUID): Boolean =
  containsEntry(uniqueId)
