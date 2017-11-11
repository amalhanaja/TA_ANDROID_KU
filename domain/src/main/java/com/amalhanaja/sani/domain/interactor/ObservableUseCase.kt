package com.amalhanaja.sani.domain.interactor

import com.amalhanaja.sani.domain.executor.PostExecutionThread
import com.amalhanaja.sani.domain.executor.ThreadExecutor
import io.reactivex.Observable
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers

/**
 * Created by doy on 11/5/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/5/17.
 */
abstract class ObservableUseCase<T, in Params>
constructor(private val threadExecutor: ThreadExecutor,
            private val postExecutionThread: PostExecutionThread){

    private val disposables = CompositeDisposable()

    protected abstract fun buildUseCase(params: Params? = null): Observable<T>

    open fun execute(observer: DisposableObserver<T>, params: Params? = null){
        val observable = this.buildUseCase(params)
                .subscribeOn(Schedulers.from(threadExecutor))
                .observeOn(postExecutionThread.scheduler)
        addDisposables(observable.subscribeWith(observer))
    }

    fun dispose(){
        if (!disposables.isDisposed) disposables.dispose()
    }

    private fun addDisposables(disposable: Disposable){
        disposables.add(disposable)
    }

}