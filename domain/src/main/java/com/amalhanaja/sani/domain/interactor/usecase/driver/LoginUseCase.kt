package com.amalhanaja.sani.domain.interactor.usecase.driver

import com.amalhanaja.sani.domain.executor.PostExecutionThread
import com.amalhanaja.sani.domain.executor.ThreadExecutor
import com.amalhanaja.sani.domain.interactor.CompletableUseCase
import com.amalhanaja.sani.domain.repository.DriverRepository
import io.reactivex.Completable
import javax.inject.Inject

/**
 * Created by doy on 11/11/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/11/17.
 */

open class LoginUseCase
@Inject constructor(val repository: DriverRepository, threadExecutor: ThreadExecutor, postExecutionThread: PostExecutionThread)
    : CompletableUseCase<LoginUseCase.Params>(threadExecutor, postExecutionThread) {
    override fun buildUseCaseCompletable(params: Params): Completable {
        return with(params){
            repository.login(username, password, fcmToken) }
    }

    class Params internal constructor(val username: String, val password: String, val fcmToken: String){
        companion object {
            fun forDriver(username: String, password: String, fcmToken: String): Params =
                    Params(username, password, fcmToken)
        }
    }

}
//open class LoginUseCase
//@Inject constructor(val repository: UserRepository,
//                    threadExecutor: ThreadExecutor,
//                    postExecutionThread: PostExecutionThread)
//    : ObservableUseCase<User, LoginUseCase.Params>(threadExecutor, postExecutionThread) {
//
//    override fun buildUseCase(params: Params?): Observable<User> = when (params){
//        null -> throw IllegalArgumentException("Need Login Parameter")
//        else -> repository.getUser(params.username, params.password, params.fcmToken)
//    }
//
//    class Params internal constructor(val username: String, val password: String, val fcmToken: String) {
//        companion object {
//            fun forUser(username: String, password: String, fcmToken: String): Params =
//                    Params(username, password, fcmToken)
//        }
//    }
//}