package com.velocitypowered.api.kt.event.player

import com.velocitypowered.api.event.player.TabCompleteEvent
import com.velocitypowered.api.proxy.connection.Player

inline val TabCompleteEvent.player: Player
  get() = player()

inline val TabCompleteEvent.partialMessage: String
  get() = partialMessage()

inline val TabCompleteEvent.suggestions: Collection<String>
  get() = suggestions()
