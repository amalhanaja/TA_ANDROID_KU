package com.amalhanaja.sani.data.source.driver

import com.amalhanaja.sani.data.repository.driver.DriverDataStore
import javax.inject.Inject

/**
 * Created by doy on 11/5/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/5/17.
 */
open class DriverDataStoreFactory
@Inject constructor(/*private val cache: DriverCache,
                    private val cacheDataStore: DriverCacheDataStore,*/
                    private val cloudDataStore: DriverCloudDataStore){
    open fun retreiveDataStore(): DriverDataStore =
            when {
                /*cache.isCached()&& cache.isAccessTokenExpired() -> {
                    cacheDataStore
                }*/
                else -> retreiveCloudDataStore()
            }
    open fun retreiveCloudDataStore(): DriverDataStore =
            cloudDataStore

//    open fun retreiveCacheDataStore(): DriverDataStore = cacheDataStore

}