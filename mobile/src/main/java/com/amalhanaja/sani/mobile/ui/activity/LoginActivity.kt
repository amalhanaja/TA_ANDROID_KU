package com.amalhanaja.sani.mobile.ui.activity

import com.amalhanaja.sani.mobile.R
import com.amalhanaja.sani.mobile.ui.custom.textWatcher
import com.amalhanaja.sani.presentation.contract.LoginContract
import kotlinx.android.synthetic.main.activity_login.*
import javax.inject.Inject

class LoginActivity : BaseActivity(), LoginContract.View {

    @Inject lateinit var _presenter: LoginContract.Presenter

    override val layoutResource: Int
        get() = R.layout.activity_login

    override fun setupView() {
        btn_login.textWatcher {

        }
        btn_login.setOnClickListener {
            when {
                edt_username.text.isBlank() -> form_username.error = "Can't Be Blank"
                edt_password.text.isBlank() -> form_password.error = "Can't Be Blank"
                else -> _presenter.onLogin(edt_username.text.toString(), edt_password.text.toString(), "1234567890")
            }
        }
    }

    override fun setPresenter(presenter: LoginContract.Presenter) {
        _presenter = presenter
    }

    override fun onLoading(isLoading: Boolean) {

    }

    override fun onError(message: String) {

    }

    override fun onSuccess() {

    }
}
