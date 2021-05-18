package com.velocitypowered.api.kt.network

import com.velocitypowered.api.network.ProtocolVersion

val ProtocolVersion.protocol: Int
  inline get() = protocol()

val ProtocolVersion.supportedVersions: Collection<String>
  inline get() = supportedVersions()

val ProtocolVersion.versionIntroducedIn: String
  inline get() = versionIntroducedIn()

val ProtocolVersion.mostRecentSupportedVersion: String
  inline get() = mostRecentSupportedVersion()
