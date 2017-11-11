package com.amalhanaja.sani.mobile.internal.di.module.activity

import com.amalhanaja.sani.domain.interactor.usecase.driver.LoginUseCase
import com.amalhanaja.sani.mobile.internal.di.scope.ActivityScope
import com.amalhanaja.sani.mobile.ui.activity.LoginActivity
import com.amalhanaja.sani.presentation.contract.LoginContract
import com.amalhanaja.sani.presentation.presenter.LoginPresenter
import dagger.Module
import dagger.Provides

/**
 * Created by doy on 11/5/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/5/17.
 */
@Module
open class LoginActivityModule {

    @Provides
    @ActivityScope
    internal fun provideLoginView(activity: LoginActivity): LoginContract.View =
            activity

    @Provides
    @ActivityScope
    internal fun provideLoginPresenter(view: LoginContract.View,
                                       useCase: LoginUseCase): LoginContract.Presenter =
            LoginPresenter(view, useCase)
}