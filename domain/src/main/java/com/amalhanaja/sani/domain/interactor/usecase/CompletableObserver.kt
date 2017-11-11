package com.amalhanaja.sani.domain.interactor.usecase

import io.reactivex.CompletableObserver
import io.reactivex.disposables.Disposable

/**
 * Created by doy on 11/11/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/11/17.
 */
class CompletableObserver: CompletableObserver {
    override fun onComplete() {
        //No Op by default
    }

    override fun onSubscribe(d: Disposable) {
        //No Op by default
    }

    override fun onError(e: Throwable) {
        //No Op by default
    }
}