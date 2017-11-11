package com.amalhanaja.sani.cloud.service

import com.amalhanaja.sani.cloud.Service
import com.amalhanaja.sani.cloud.model.response.AccessTokenResponse
import io.reactivex.Completable
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.POST

/**
 * Created by doy on 11/10/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/10/17.
 */
interface TokenService: Service {

    @POST("/token")
    fun getAccessToken(username: String, password: String): Observable<AccessTokenResponse>

    @GET("/token/refresh")
    fun refreshAccessToken(accessToken: String): Observable<AccessTokenResponse>

    @POST("/token/update")
    fun updateFcmToken(accessToken: String, fcmToken: String): Completable

}