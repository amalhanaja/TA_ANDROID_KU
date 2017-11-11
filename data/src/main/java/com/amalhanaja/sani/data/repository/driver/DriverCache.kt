package com.amalhanaja.sani.data.repository.driver

import com.amalhanaja.sani.data.model.TokenEntity
import io.reactivex.Completable
import io.reactivex.Observable

/**
 * Created by doy on 11/5/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/5/17.
 */
interface DriverCache {

    val token: Observable<TokenEntity>

    val isAccessTokenExpired: Boolean

    fun saveToken(tokenEntity: TokenEntity): Completable

//    fun clearUser(): Completable
//
//    fun saveUser(driver: DriverEntity): Completable
//
//    fun getUser(username: String): Observable<DriverEntity>
//
//    fun isCached(): Boolean

//    fun isAccessTokenExpired(): Boolean

//    fun setAccessTokenExpired(expiredAt: Long)

}