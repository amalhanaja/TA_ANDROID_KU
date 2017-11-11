package com.amalhanaja.sani.cloud

import com.amalhanaja.sani.cloud.model.response.driver.DriverLoginResponse
import com.amalhanaja.sani.data.model.TokenEntity

/**
 * Created by doy on 11/5/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/5/17.
 */

//fun LoginResponse.mapFromRemote(username: String, deviceId: String): DriverEntity {
//    return DriverEntity(uuid, username, deviceId = deviceId)
//}

fun DriverLoginResponse.mapFromResponse(): TokenEntity {
    return TokenEntity(accessToken, expiresIn, tokenType)
}