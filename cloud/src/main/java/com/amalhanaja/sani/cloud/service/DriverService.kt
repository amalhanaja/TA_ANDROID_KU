package com.amalhanaja.sani.cloud.service

import com.amalhanaja.sani.cloud.model.request.driver.DriverLoginRequest
import com.amalhanaja.sani.cloud.model.response.driver.DriverLoginResponse
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.POST

/**
 * Created by doy on 11/11/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/11/17.
 */

interface DriverService {

    @POST("driver/login")
    fun loginDriver(@Body request: DriverLoginRequest): Observable<DriverLoginResponse>

}