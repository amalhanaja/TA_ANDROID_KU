package com.amalhanaja.sani.domain.repository

import io.reactivex.Completable
import io.reactivex.Observable

/**
 * Created by doy on 11/6/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/6/17.
 */
interface DeviceRepository {
    fun getDeviceId(deviceModel: String? = null, deviceBrand: String? = null, osVersionCode: String? = null): Observable<String>
    fun saveDeviceId(deviceId: String): Completable
}