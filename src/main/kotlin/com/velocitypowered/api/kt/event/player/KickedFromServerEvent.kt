package com.velocitypowered.api.kt.event.player

import com.velocitypowered.api.event.player.KickedFromServerEvent
import com.velocitypowered.api.proxy.connection.Player
import com.velocitypowered.api.proxy.server.RegisteredServer
import net.kyori.adventure.text.Component

val KickedFromServerEvent.player: Player
  inline get() = player()

val KickedFromServerEvent.server: RegisteredServer
  inline get() = server()

val KickedFromServerEvent.serverKickReason: Component?
  inline get() = serverKickReason()

val KickedFromServerEvent.isKickedDuringServerConnect: Boolean
  inline get() = kickedDuringServerConnect()

val KickedFromServerEvent.DisconnectPlayer.message: Component
  inline get() = message()

val KickedFromServerEvent.RedirectPlayer.message: Component?
  inline get() = message()

val KickedFromServerEvent.Notify.message: Component
  inline get() = message()
