package com.amalhanaja.sani.cloud.model.response

/**
 * Created by doy on 11/5/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/5/17.
 */
data class LoginResponse(
        val accessToken: String? = null,
        val tokenType: String? = null,
        val expiresIn: Long = 0
)