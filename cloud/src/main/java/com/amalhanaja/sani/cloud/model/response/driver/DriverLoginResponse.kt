package com.amalhanaja.sani.cloud.model.response.driver

data class DriverLoginResponse(
	val expiresIn: Long,
	val accessToken: String,
	val tokenType: String
)
