package com.velocitypowered.api.kt.util

import com.velocitypowered.api.util.GameProfile
import java.util.UUID

inline val GameProfile.uniqueId: UUID
  get() = uuid()

inline val GameProfile.name: String
  get() = name()

inline val GameProfile.properties: Collection<GameProfile.Property>
  get() = properties()

operator fun GameProfile.plus(properties: Iterable<GameProfile.Property>): GameProfile =
  addProperties(properties)

operator fun GameProfile.plus(property: GameProfile.Property): GameProfile =
  addProperty(property)

operator fun GameProfile.component1(): UUID = uniqueId
operator fun GameProfile.component2(): String = name
operator fun GameProfile.component3(): Collection<GameProfile.Property> = properties

inline val GameProfile.Property.name: String
  get() = name()

inline val GameProfile.Property.value: String
  get() = value()

inline val GameProfile.Property.signature: String?
  get() = signature()

operator fun GameProfile.Property.component1(): String = name
operator fun GameProfile.Property.component2(): String = value
operator fun GameProfile.Property.component3(): String? = signature
