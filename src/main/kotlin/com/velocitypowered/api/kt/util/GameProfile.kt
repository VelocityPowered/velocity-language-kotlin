package com.velocitypowered.api.kt.util

import com.velocitypowered.api.util.GameProfile
import java.util.UUID

val GameProfile.uniqueId: UUID
  inline get() = uuid()

val GameProfile.name: String
  inline get() = name()

val GameProfile.properties: Collection<GameProfile.Property>
  inline get() = properties()

operator fun GameProfile.plus(properties: Iterable<GameProfile.Property>): GameProfile =
  addProperties(properties)

operator fun GameProfile.plus(property: GameProfile.Property): GameProfile =
  addProperty(property)

operator fun GameProfile.component1(): UUID = uniqueId
operator fun GameProfile.component2(): String = name
operator fun GameProfile.component3(): Collection<GameProfile.Property> = properties

val GameProfile.Property.name: String
  inline get() = name()

val GameProfile.Property.value: String
  inline get() = value()

val GameProfile.Property.signature: String?
  inline get() = signature()

operator fun GameProfile.Property.component1(): String = name
operator fun GameProfile.Property.component2(): String = value
operator fun GameProfile.Property.component3(): String? = signature
