package com.amalhanaja.sani.data.repository.driver

import com.amalhanaja.sani.data.model.TokenEntity
import io.reactivex.Observable

/**
 * Created by doy on 11/5/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/5/17.
 */
interface DriverDataStore {
//    fun clearUser(): Completable
//    fun saveUser(driverEntity: DriverEntity): Completable
    fun login(username: String, password: String, fcmToken: String): Observable<TokenEntity>
//    fun saveLoginInfo
    val isLoggedIn: Boolean
}