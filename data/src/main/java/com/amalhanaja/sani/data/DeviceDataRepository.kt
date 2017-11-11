package com.amalhanaja.sani.data

import com.amalhanaja.sani.data.source.device.DeviceCloudDataStore
import com.amalhanaja.sani.data.source.device.DeviceDataStoreFactory
import com.amalhanaja.sani.domain.repository.DeviceRepository
import io.reactivex.Completable
import io.reactivex.Observable
import javax.inject.Inject

/**
 * Created by doy on 11/6/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/6/17.
 */
class DeviceDataRepository
@Inject constructor(private val factory: DeviceDataStoreFactory)
    : DeviceRepository {

    private val dataStore = factory.retreiveDataStore()

    override fun getDeviceId(deviceModel: String?, deviceBrand: String?, osVersionCode: String?): Observable<String> {
        return dataStore.getDeviceId(deviceModel, deviceBrand, osVersionCode)
                .flatMap {
                    if (dataStore is DeviceCloudDataStore){
                        saveDeviceId(it).toObservable()
                    } else {
                        Observable.just(it)
                    }
                }
    }

    override fun saveDeviceId(deviceId: String): Completable {
        return factory.retreiveCacheDataStore().saveDeviceId(deviceId)
    }
}