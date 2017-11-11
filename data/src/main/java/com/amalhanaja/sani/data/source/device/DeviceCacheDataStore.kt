package com.amalhanaja.sani.data.source.device

import com.amalhanaja.sani.data.repository.device.DeviceCache
import com.amalhanaja.sani.data.repository.device.DeviceDataStore
import io.reactivex.Completable
import io.reactivex.Observable
import javax.inject.Inject

/**
 * Created by doy on 11/6/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/6/17.
 */

open class DeviceCacheDataStore
@Inject constructor(private val cache: DeviceCache)
    : DeviceDataStore {
    override fun getDeviceId(deviceModel: String?, deviceBrand: String?, osVersionCode: String?): Observable<String> {
        return cache.getDeviceId()
    }

    override fun saveDeviceId(deviceId: String): Completable {
        return cache.saveDeviceId(deviceId)
    }
}