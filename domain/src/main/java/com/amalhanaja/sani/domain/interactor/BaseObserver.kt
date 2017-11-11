package com.amalhanaja.sani.domain.interactor

import io.reactivex.observers.DisposableObserver

/**
 * Created by doy on 11/5/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/5/17.
 */
open class BaseObserver<T>: DisposableObserver<T>() {
    override fun onNext(t: T) {
        // No Operation by Default
    }

    override fun onError(e: Throwable) {
        // No Operation by Default
    }

    override fun onComplete() {
        // No Operation by Default
    }
}