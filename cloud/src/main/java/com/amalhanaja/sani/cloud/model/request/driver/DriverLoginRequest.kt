package com.amalhanaja.sani.cloud.model.request.driver

/**
 * Created by doy on 11/11/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/11/17.
 */

data class DriverLoginRequest(
        val username: String,
        val password: String,
        val fcmToken: String
)