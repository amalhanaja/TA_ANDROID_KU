//package com.amalhanaja.sani.cloud
//
//import com.amalhanaja.sani.cloud.model.request.LoginRequest
//import com.amalhanaja.sani.cloud.model.service.UserService
//import com.amalhanaja.sani.data.model.DriverEntity
//import com.amalhanaja.sani.data.repository.user.DriverCloud
//import io.reactivex.Observable
//import javax.inject.Inject
//
///**
// * Created by doy on 11/5/17.
// * Email : amalhanaja@gmail.com
// * Created On : 11/5/17.
// */
//class UserCloudImpl
//@Inject constructor(private val service: UserService)
//    : DriverCloud {
//
//    override fun getUser(username: String, deviceId: String, password: String): Observable<DriverEntity> {
//        return service.loginUser(LoginRequest(username, deviceId, password))
//                .map { it.mapFromRemote(username, deviceId) }
//    }
//}