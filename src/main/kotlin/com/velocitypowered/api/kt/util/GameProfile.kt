package com.velocitypowered.api.kt.util

import com.velocitypowered.api.util.GameProfile
import java.util.UUID

operator fun GameProfile.plus(properties: Iterable<GameProfile.Property>): GameProfile =
  addProperties(properties)

operator fun GameProfile.plus(property: GameProfile.Property): GameProfile =
  addProperty(property)

operator fun GameProfile.component1(): UUID = id
operator fun GameProfile.component2(): String = name
operator fun GameProfile.component3(): Collection<GameProfile.Property> = properties

operator fun GameProfile.Property.component1(): String = name
operator fun GameProfile.Property.component2(): String = value
operator fun GameProfile.Property.component3(): String? = signature
