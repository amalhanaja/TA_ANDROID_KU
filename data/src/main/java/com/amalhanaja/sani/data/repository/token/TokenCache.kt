package com.amalhanaja.sani.data.repository.token

import com.amalhanaja.sani.data.model.TokenEntity
import io.reactivex.Completable
import io.reactivex.Observable

/**
 * Created by doy on 11/10/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/10/17.
 */
interface TokenCache {

    val isCached: Boolean

    val isTokenExpired: Boolean

    fun getToken(): Observable<TokenEntity>

    fun saveToken(tokenEntity: TokenEntity): Completable

    fun clearToken()

}