package com.amalhanaja.sani.mobile.service

import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

/**
 * Created by doy on 11/10/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/10/17.
 */
class FirebaseMessageService: FirebaseMessagingService() {

    override fun onMessageReceived(message: RemoteMessage) {
        println(message.from)
        when {
            message.data.isNotEmpty() -> {
                println("Data Received : ${message.data.entries}")
                //TODO: HANDLE RECEIVED DATA
            }
            message.notification != null -> {
                println("Notification Received: ${message.notification.body}")
                //TODO: HANDLE RECEIVED NOTIFICATION
            }
        }

    }
}