package com.amalhanaja.sani.mobile.internal.di.component

import android.app.Application
import com.amalhanaja.sani.mobile.SaniApplication
import com.amalhanaja.sani.mobile.internal.di.module.ActivityBindingModule
import com.amalhanaja.sani.mobile.internal.di.module.ApplicationModule
import com.amalhanaja.sani.mobile.internal.di.scope.ApplicationScope
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule

/**
 * Created by doy on 11/5/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/5/17.
 */

@ApplicationScope
@Component(modules = arrayOf (
        AndroidSupportInjectionModule::class,
        ApplicationModule::class,
        ActivityBindingModule::class)
)
interface ApplicationComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder
        fun build(): ApplicationComponent
    }
    fun inject(application: SaniApplication)
}