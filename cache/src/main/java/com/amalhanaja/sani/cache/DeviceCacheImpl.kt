package com.amalhanaja.sani.cache

import com.amalhanaja.sani.cache.session.DeviceSessionManager
import com.amalhanaja.sani.data.repository.device.DeviceCache
import io.reactivex.Completable
import io.reactivex.Observable
import javax.inject.Inject

/**
 * Created by doy on 11/6/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/6/17.
 */
class DeviceCacheImpl
@Inject constructor(private val session: DeviceSessionManager)
    : DeviceCache {
    override fun getDeviceId(): Observable<String> {
        return Observable.just(session.deviceId)
    }

    override fun saveDeviceId(deviceId: String): Completable {
        return Completable.defer {
            session.deviceId = deviceId
            Completable.complete()
        }
    }

    override val isCached: Boolean
        get() = when {
            session.deviceId.isBlank() -> false
            else -> true
        }
}