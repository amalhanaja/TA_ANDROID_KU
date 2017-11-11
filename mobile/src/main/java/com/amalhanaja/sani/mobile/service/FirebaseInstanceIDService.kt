package com.amalhanaja.sani.mobile.service

import android.annotation.SuppressLint
import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.iid.FirebaseInstanceIdService

@SuppressLint("Registered")
/**
 * Created by doy on 11/10/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/10/17.
 */
class FirebaseInstanceIDService: FirebaseInstanceIdService() {
    override fun onTokenRefresh() {
        val refreshToken = FirebaseInstanceId.getInstance().token

        updateUserFcmToken(refreshToken)
    }

    private fun updateUserFcmToken(refreshToken: String?) {
        println(refreshToken)
    }
}