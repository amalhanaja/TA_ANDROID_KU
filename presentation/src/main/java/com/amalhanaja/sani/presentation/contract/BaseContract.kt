package com.amalhanaja.sani.presentation.contract

/**
 * Created by doy on 11/5/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/5/17.
 */
interface BaseContract {

    interface View<in P: Presenter> {
        fun setPresenter(presenter: P)
    }

    interface Presenter{
        fun subscribe()
        fun unsubscribe()
    }

}