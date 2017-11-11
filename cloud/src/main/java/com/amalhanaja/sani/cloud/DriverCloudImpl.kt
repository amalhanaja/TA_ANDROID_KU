package com.amalhanaja.sani.cloud

import com.amalhanaja.sani.cloud.model.request.driver.DriverLoginRequest
import com.amalhanaja.sani.cloud.service.DriverService
import com.amalhanaja.sani.data.model.TokenEntity
import com.amalhanaja.sani.data.repository.driver.DriverCloud
import io.reactivex.Observable
import javax.inject.Inject

/**
 * Created by doy on 11/11/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/11/17.
 */
class DriverCloudImpl
@Inject constructor(private val service: DriverService)
    : DriverCloud {
    override fun login(username: String, password: String, fcmToken: String): Observable<TokenEntity> {
        return service.loginDriver(DriverLoginRequest(username, password, fcmToken)).map { it.mapFromResponse() }
    }
}