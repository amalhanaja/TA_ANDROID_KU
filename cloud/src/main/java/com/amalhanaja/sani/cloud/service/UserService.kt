package com.amalhanaja.sani.cloud.model.service

import com.amalhanaja.sani.cloud.model.request.LoginRequest
import com.amalhanaja.sani.cloud.model.response.LoginResponse
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.POST

/**
 * Created by doy on 11/5/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/5/17.
 */
interface UserService {

    @POST("user/login")
    fun loginUser(@Body request: LoginRequest): Observable<LoginResponse>

}