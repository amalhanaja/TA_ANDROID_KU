package com.amalhanaja.sani.data.source.device

import com.amalhanaja.sani.data.repository.device.DeviceCache
import com.amalhanaja.sani.data.repository.device.DeviceDataStore
import javax.inject.Inject

/**
 * Created by doy on 11/6/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/6/17.
 */
open class DeviceDataStoreFactory
@Inject constructor(private val cache: DeviceCache,
                    private val cacheDataStore: DeviceCacheDataStore,
                    private val cloudDataStore: DeviceCloudDataStore){
    open fun retreiveDataStore(): DeviceDataStore {
        println(cache.isCached)
        return when {
            cache.isCached -> cacheDataStore
            else -> cloudDataStore
        }
    }
    open fun retreiveCacheDataStore(): DeviceDataStore =
            cacheDataStore

    open fun retreiveCloudDataStore(): DeviceDataStore =
            cloudDataStore
}