package com.amalhanaja.sani.domain.interactor.usecase

import com.amalhanaja.sani.domain.executor.PostExecutionThread
import com.amalhanaja.sani.domain.executor.ThreadExecutor
import com.amalhanaja.sani.domain.interactor.ObservableUseCase
import com.amalhanaja.sani.domain.repository.DeviceRepository
import io.reactivex.Observable
import javax.inject.Inject

/**
 * Created by doy on 11/6/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/6/17.
 */

open class RegisterDeviceUseCase
@Inject constructor(val repository: DeviceRepository, threadExecutor: ThreadExecutor,
                    postExecutionThread: PostExecutionThread)
    : ObservableUseCase<String, RegisterDeviceUseCase.Params>(threadExecutor, postExecutionThread) {

    override fun buildUseCase(params: Params?): Observable<String>  = when(params) {
        null -> throw IllegalArgumentException("Need Device Parameter")
        else -> repository.getDeviceId(params.deviceModel, params.deviceBrand, params.osVersionCode)
    }

    class Params internal constructor(val deviceModel: String,val deviceBrand: String,
                                      val osVersionCode: String){
        companion object {
            fun forDevice(deviceModel: String, deviceBrand: String, osVersionCode: String): Params{
                return Params(deviceModel, deviceBrand, osVersionCode)
            }
        }
    }
}