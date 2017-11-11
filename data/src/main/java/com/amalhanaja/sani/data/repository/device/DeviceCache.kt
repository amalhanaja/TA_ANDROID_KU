package com.amalhanaja.sani.data.repository.device

import io.reactivex.Completable
import io.reactivex.Observable

/**
 * Created by doy on 11/6/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/6/17.
 */
interface DeviceCache {
    fun getDeviceId(): Observable<String>
    fun saveDeviceId(deviceId: String): Completable
    val isCached: Boolean
}