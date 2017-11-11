//package com.amalhanaja.sani.data.source.driver
//
//import com.amalhanaja.sani.data.model.DriverEntity
//import com.amalhanaja.sani.data.repository.driver.DriverCache
//import com.amalhanaja.sani.data.repository.driver.DriverDataStore
//import io.reactivex.Completable
//import io.reactivex.Observable
//import javax.inject.Inject
//
///**
// * Created by doy on 11/5/17.
// * Email : amalhanaja@gmail.com
// * Created On : 11/5/17.
// */
//open class DriverCacheDataStore
//@Inject constructor(private val cache: DriverCache)
//    : DriverDataStore {
//    override fun clearUser(): Completable {
//        return cache.clearUser()
//    }
//
//    override fun saveUser(driverEntity: DriverEntity): Completable {
//        return cache.saveUser(driverEntity)
//                .doOnComplete {
//
//                }
//    }
//
//    override fun getUser(username: String, deviceId: String, password: String): Observable<DriverEntity> {
//        return cache.getUser(username)
//    }
//
//    override val isLoggedIn: Boolean
//        get() = true
//}