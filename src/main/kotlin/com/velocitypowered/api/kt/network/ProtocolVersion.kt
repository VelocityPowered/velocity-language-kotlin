package com.velocitypowered.api.kt.network

import com.velocitypowered.api.network.ProtocolVersion

inline val ProtocolVersion.protocol: Int
  get() = protocol()

inline val ProtocolVersion.supportedVersions: Collection<String>
  get() = supportedVersions()

inline val ProtocolVersion.versionIntroducedIn: String
  get() = versionIntroducedIn()

inline val ProtocolVersion.mostRecentSupportedVersion: String
  get() = mostRecentSupportedVersion()
