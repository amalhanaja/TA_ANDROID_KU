package com.amalhanaja.sani.presentation.contract

/**
 * Created by doy on 11/5/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/5/17.
 */
interface LoginContract {

    interface View: BaseContract.View<Presenter> {
        fun onLoading(isLoading: Boolean)
        fun onError(message: String)
        fun onSuccess()
    }

    interface Presenter: BaseContract.Presenter {
        fun onLogin(username: String, password: String, fcmToken: String)
//        fun onLogin(username: String, password: String, deviceModel: String, deviceBrand: String, osVersionCode: String)
//        fun onLogin(username: String, deviceId: String, password: String)
//        fun retreiveDeviceId(deviceModel: String, deviceBrand: String, osVersionCode: String)
    }
}