package com.amalhanaja.sani.domain.interactor

import io.reactivex.subscribers.DefaultSubscriber


/**
 * Created by doy on 11/10/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/10/17.
 */
class FlowableObserver<T>: DefaultSubscriber<T>() {

    override fun onStart() {
        super.onStart()
    }

    override fun onComplete() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onError(t: Throwable?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onNext(t: T) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}