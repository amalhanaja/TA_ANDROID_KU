package com.amalhanaja.sani.domain.interactor

import com.amalhanaja.sani.domain.executor.PostExecutionThread
import com.amalhanaja.sani.domain.executor.ThreadExecutor
import io.reactivex.Completable
import io.reactivex.disposables.Disposables
import io.reactivex.schedulers.Schedulers

/**
 * Created by doy on 11/5/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/5/17.
 */
abstract class CompletableUseCase<in Params>
protected constructor(private val threadExecutor: ThreadExecutor,
                      private val postExecutionThread: PostExecutionThread){

    private val disposables = Disposables.empty()

    protected abstract fun buildUseCaseCompletable(params: Params): Completable

    fun execute(params: Params): Completable{
        return buildUseCaseCompletable(params)
                .subscribeOn(Schedulers.from(threadExecutor))
                .observeOn(postExecutionThread.scheduler)
    }
    fun dispose(){
        if (!disposables.isDisposed) disposables.dispose()
    }
}