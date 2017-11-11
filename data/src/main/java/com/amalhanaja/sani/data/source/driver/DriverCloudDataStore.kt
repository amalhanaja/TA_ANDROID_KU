package com.amalhanaja.sani.data.source.driver

import com.amalhanaja.sani.data.model.TokenEntity
import com.amalhanaja.sani.data.repository.driver.DriverCloud
import com.amalhanaja.sani.data.repository.driver.DriverDataStore
import io.reactivex.Observable
import javax.inject.Inject

/**
 * Created by doy on 11/5/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/5/17.
 */
open class DriverCloudDataStore
@Inject constructor(private val cloud: DriverCloud)
    : DriverDataStore {
    override fun login(username: String, password: String, fcmToken: String): Observable<TokenEntity> {
        return cloud.login(username, password, fcmToken)
    }

    override val isLoggedIn: Boolean = false

    //    override fun clearUser(): Completable {
//        throw UnsupportedOperationException("Can't Clear User from Cloud")
//    }
//
//    override fun saveUser(driverEntity: DriverEntity): Completable {
//        throw UnsupportedOperationException("Can't Save User To Cloud")
//    }
//
//    override fun getUser(username: String, deviceId: String, password: String): Observable<DriverEntity> {
//        return cloud.getUser(username, deviceId, password)
//    }
//
//    override val isLoggedIn: Boolean
//        get() = false
}