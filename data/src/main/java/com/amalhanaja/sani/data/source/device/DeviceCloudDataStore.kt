package com.amalhanaja.sani.data.source.device

import com.amalhanaja.sani.data.repository.device.DeviceCloud
import com.amalhanaja.sani.data.repository.device.DeviceDataStore
import io.reactivex.Completable
import io.reactivex.Observable
import javax.inject.Inject

/**
 * Created by doy on 11/6/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/6/17.
 */
open class DeviceCloudDataStore
@Inject constructor(private val cloud: DeviceCloud)
    : DeviceDataStore {

    override fun getDeviceId(deviceModel: String?, deviceBrand: String?, osVersionCode: String?): Observable<String> {
        if (deviceModel == null || deviceBrand == null || osVersionCode == null){
            throw IllegalArgumentException("Can't Get Device ID without Parameter")
        }
        return cloud.getDeviceId(deviceModel, deviceBrand, osVersionCode)
    }

    override fun saveDeviceId(deviceId: String): Completable {
        throw UnsupportedOperationException("Can't Save Device ID to Cloud")
    }
}