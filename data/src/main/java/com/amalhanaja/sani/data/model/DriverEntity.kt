package com.amalhanaja.sani.data.model

/**
 * Created by doy on 11/5/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/5/17.
 */
data class DriverEntity(
        val uuid: String? = null,
        val username: String? = null,
        val firstName: String? = null,
        val lastName: String? = null,
        val phoneNumber: Long? = null,
        val countryCode: Short? = null,
        val fcmToken: String? = null,
        val createdAt: String? = null,
        val lastModified: String? = null,
        val latitude: Float? = null,
        val longitude: Float? = null,
        val status: String? = null
)