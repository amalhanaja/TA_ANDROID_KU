package com.amalhanaja.sani.cloud.model.request

/**
 * Created by doy on 11/6/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/6/17.
 */
data class RegisterDeviceRequest(
        val model: String,
        val brand: String,
        val osVersion: String
)