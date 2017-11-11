package com.amalhanaja.sani.cloud.service

import com.amalhanaja.sani.cloud.model.request.RegisterDeviceRequest
import com.amalhanaja.sani.cloud.model.response.DeviceResponse
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.POST

/**
 * Created by doy on 11/6/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/6/17.
 */
interface DeviceService {

    @POST("device/register")
    fun registerDevice(@Body request: RegisterDeviceRequest): Observable<DeviceResponse>
}