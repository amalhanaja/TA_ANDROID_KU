package com.amalhanaja.sani.mobile

import android.app.Activity
import android.app.Application
import com.amalhanaja.sani.mobile.internal.di.component.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import timber.log.Timber
import javax.inject.Inject

/**
 * Created by doy on 11/5/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/5/17.
 */
class SaniApplication: Application(), HasActivityInjector {

    @Inject lateinit var activityDispatchingInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()
        initializeInjector()
        setupDebugger()
    }

    private fun setupDebugger() {
        if (BuildConfig.DEBUG){
            Timber.plant(Timber.DebugTree())
        }
    }

    private fun initializeInjector() {
        DaggerApplicationComponent
                .builder()
                .application(this)
                .build()
                .inject(this)
    }

    override fun activityInjector(): AndroidInjector<Activity> =
            activityDispatchingInjector
}