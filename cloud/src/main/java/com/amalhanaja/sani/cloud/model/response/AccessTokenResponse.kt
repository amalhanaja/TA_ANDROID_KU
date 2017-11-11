package com.amalhanaja.sani.cloud.model.response

/**
 * Created by doy on 11/10/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/10/17.
 */
data class AccessTokenResponse(
        val accessToken: String,
        val tokenType: String,
        val expiresIn: Long
)