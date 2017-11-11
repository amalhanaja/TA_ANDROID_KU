package com.amalhanaja.sani.data.model

/**
 * Created by doy on 11/10/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/10/17.
 */
data class TokenEntity(
     val accessToken: String,
     val expiresIn: Long,
     val tokenType: String
)