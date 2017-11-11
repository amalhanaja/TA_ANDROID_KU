package com.amalhanaja.sani.data.repository.token

import com.amalhanaja.sani.data.model.TokenEntity
import io.reactivex.Completable
import io.reactivex.Observable

/**
 * Created by doy on 11/10/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/10/17.
 */
interface TokenCloud {
    fun getAccessToken(username: String, password: String, fcmToken: String): Observable<TokenEntity>
    fun refreshAccessToken(accessToken: String): Observable<TokenEntity>
    fun updateFcmToken(accessToken: String, fcmToken: String): Completable
}