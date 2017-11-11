package com.amalhanaja.sani.cloud.model.request

/**
 * Created by doy on 11/6/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/6/17.
 */
data class LoginRequest(
        val username: String,
        val password: String,
        val fcmToken: String
)