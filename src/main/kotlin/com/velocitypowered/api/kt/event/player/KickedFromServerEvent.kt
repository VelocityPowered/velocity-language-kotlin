package com.velocitypowered.api.kt.event.player

import com.velocitypowered.api.event.player.KickedFromServerEvent
import com.velocitypowered.api.proxy.connection.Player
import com.velocitypowered.api.proxy.server.RegisteredServer
import net.kyori.adventure.text.Component

inline val KickedFromServerEvent.player: Player
  get() = player()

inline val KickedFromServerEvent.server: RegisteredServer
  get() = server()

inline val KickedFromServerEvent.serverKickReason: Component?
  get() = serverKickReason()

inline val KickedFromServerEvent.isKickedDuringServerConnect: Boolean
  get() = kickedDuringServerConnect()

inline val KickedFromServerEvent.DisconnectPlayer.message: Component
  get() = message()

inline val KickedFromServerEvent.RedirectPlayer.message: Component?
  get() = message()

inline val KickedFromServerEvent.Notify.message: Component
  get() = message()
