package com.amalhanaja.sani.presentation.presenter

import com.amalhanaja.sani.domain.interactor.usecase.driver.LoginUseCase
import com.amalhanaja.sani.presentation.contract.LoginContract
import javax.inject.Inject

/**
 * Created by doy on 11/5/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/5/17.
 */
class LoginPresenter
@Inject constructor(val view: LoginContract.View,
                    val useCase: LoginUseCase)
    : LoginContract.Presenter {

    init {
        view.setPresenter(this)
    }

    override fun subscribe() {

    }

    override fun unsubscribe() {
        useCase.dispose()
    }

    override fun onLogin(username: String, password: String, fcmToken: String) {
        useCase.execute(LoginUseCase.Params.forDriver(username, password, fcmToken))
                .subscribe({
                    println("LOGIN SUKSES")
                }, {
                    it.printStackTrace()
                    println(it.message)
                })
    }
}