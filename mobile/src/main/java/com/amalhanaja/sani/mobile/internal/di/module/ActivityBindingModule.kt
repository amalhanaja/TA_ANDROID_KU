package com.amalhanaja.sani.mobile.internal.di.module

import com.amalhanaja.sani.mobile.internal.di.module.activity.LoginActivityModule
import com.amalhanaja.sani.mobile.internal.di.scope.ActivityScope
import com.amalhanaja.sani.mobile.ui.activity.LoginActivity
import com.amalhanaja.sani.mobile.ui.activity.MapsActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by doy on 11/5/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/5/17.
 */

@Module
abstract class ActivityBindingModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = arrayOf(LoginActivityModule::class))
    abstract fun bindLoginActivity(): LoginActivity

    @ActivityScope
    @ContributesAndroidInjector
    abstract fun bindMapsActivity(): MapsActivity

}