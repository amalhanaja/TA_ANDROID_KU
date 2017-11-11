package com.amalhanaja.sani.cloud

import com.amalhanaja.sani.cloud.model.request.RegisterDeviceRequest
import com.amalhanaja.sani.cloud.service.DeviceService
import com.amalhanaja.sani.data.repository.device.DeviceCloud
import io.reactivex.Observable
import javax.inject.Inject

/**
 * Created by doy on 11/6/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/6/17.
 */
class DeviceCloudImpl
@Inject constructor(private val service: DeviceService)
    : DeviceCloud {
    override fun getDeviceId(deviceModel: String, deviceBrand: String, osVersionCode: String): Observable<String> {
        return service.registerDevice(RegisterDeviceRequest(deviceModel, deviceBrand, osVersionCode)).map { it.uuid ?: "" }
    }
}