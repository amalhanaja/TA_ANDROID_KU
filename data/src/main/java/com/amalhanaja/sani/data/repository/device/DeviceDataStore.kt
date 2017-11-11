package com.amalhanaja.sani.data.repository.device

import io.reactivex.Completable
import io.reactivex.Observable

/**
 * Created by doy on 11/6/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/6/17.
 */
interface DeviceDataStore {
    fun getDeviceId(deviceModel: String? = null, deviceBrand: String? = null, osVersionCode: String? = null): Observable<String>
    fun saveDeviceId(deviceId: String): Completable
}