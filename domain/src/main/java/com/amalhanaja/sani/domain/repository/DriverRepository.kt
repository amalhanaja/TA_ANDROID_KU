package com.amalhanaja.sani.domain.repository

import io.reactivex.Completable

/**
 * Created by doy on 11/11/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/11/17.
 */
interface DriverRepository {
    fun login(username: String, password: String, fcmToken: String): Completable
}