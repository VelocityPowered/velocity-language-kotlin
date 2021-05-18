package com.velocitypowered.api.kt.event.permission

import com.velocitypowered.api.event.permission.PermissionsSetupEvent
import com.velocitypowered.api.permission.PermissionProvider
import com.velocitypowered.api.permission.PermissionSubject

val PermissionsSetupEvent.subject: PermissionSubject
  inline get() = subject()

var PermissionsSetupEvent.provider: PermissionProvider
  inline get() = provider()
  inline set(value) {
    setProvider(value)
  }

fun PermissionsSetupEvent.resetProvider() = setProvider(null)
