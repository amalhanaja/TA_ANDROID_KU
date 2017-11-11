package com.amalhanaja.sani.domain.interactor.usecase

import com.amalhanaja.sani.domain.executor.PostExecutionThread
import com.amalhanaja.sani.domain.executor.ThreadExecutor
import com.amalhanaja.sani.domain.interactor.ObservableUseCase
import com.amalhanaja.sani.domain.model.User
import com.amalhanaja.sani.domain.repository.UserRepository
import io.reactivex.Observable
import javax.inject.Inject

/**
 * Created by doy on 11/5/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/5/17.
 */
open class LoginUseCase
@Inject constructor(val repository: UserRepository,
                    threadExecutor: ThreadExecutor,
                    postExecutionThread: PostExecutionThread)
    : ObservableUseCase<User, LoginUseCase.Params>(threadExecutor, postExecutionThread) {

    override fun buildUseCase(params: Params?): Observable<User> = when (params){
        null -> throw IllegalArgumentException("Need Login Parameter")
        else -> repository.getUser(params.username, params.password, params.fcmToken)
    }

    class Params internal constructor(val username: String, val password: String, val fcmToken: String) {
        companion object {
            fun forUser(username: String, password: String, fcmToken: String): Params =
                    Params(username, password, fcmToken)
        }
    }
}