package com.amalhanaja.sani.data.repository.device

import io.reactivex.Observable

/**
 * Created by doy on 11/6/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/6/17.
 */
interface DeviceCloud {
    fun getDeviceId(deviceModel: String, deviceBrand: String, osVersionCode: String): Observable<String>
}