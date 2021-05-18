package com.velocitypowered.api.kt.event.player

import com.velocitypowered.api.event.player.TabCompleteEvent
import com.velocitypowered.api.proxy.connection.Player

val TabCompleteEvent.player: Player
  inline get() = player()

val TabCompleteEvent.partialMessage: String
  inline get() = partialMessage()

val TabCompleteEvent.suggestions: Collection<String>
  inline get() = suggestions()
