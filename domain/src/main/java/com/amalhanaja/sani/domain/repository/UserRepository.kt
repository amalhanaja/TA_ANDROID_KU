package com.amalhanaja.sani.domain.repository

import com.amalhanaja.sani.domain.model.User
import io.reactivex.Completable
import io.reactivex.Observable

/**
 * Created by doy on 11/5/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/5/17.
 */
interface UserRepository {
    fun getUser(username: String, password: String, fcmToken: String): Observable<User>
    fun saveUser(user: User): Completable
    fun clearUser(): Completable
    val isLoggedIn: Boolean
}