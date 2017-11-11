package com.amalhanaja.sani.domain.model

import java.util.*

/**
 * Created by doy on 11/5/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/5/17.
 */
data class User(
        val uuid: String? = null,
        val username: String? = null,
        val firstName: String? = null,
        val lastName: String? = null,
        val phoneNumber: Long? = null,
        val deviceId: String? = null,
        val vehicleId: String? = null,
        val createdAt: Date? = null,
        val lastModified: Date? = null,
        val status: UserStatus? = null
)