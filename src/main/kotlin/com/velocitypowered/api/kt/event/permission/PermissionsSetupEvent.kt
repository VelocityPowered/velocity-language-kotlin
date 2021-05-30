package com.velocitypowered.api.kt.event.permission

import com.velocitypowered.api.event.permission.PermissionsSetupEvent
import com.velocitypowered.api.permission.PermissionProvider
import com.velocitypowered.api.permission.PermissionSubject

inline val PermissionsSetupEvent.subject: PermissionSubject
  get() = subject()

inline var PermissionsSetupEvent.provider: PermissionProvider
  get() = provider()
  set(value) {
    setProvider(value)
  }

fun PermissionsSetupEvent.resetProvider() = setProvider(null)
