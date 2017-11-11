package com.amalhanaja.sani.mobile.internal.di.module

import android.app.Application
import android.content.Context
import com.amalhanaja.sani.cache.DeviceCacheImpl
import com.amalhanaja.sani.cache.session.DeviceSessionManager
import com.amalhanaja.sani.cloud.DriverCloudImpl
import com.amalhanaja.sani.cloud.createService
import com.amalhanaja.sani.cloud.service.DriverService
import com.amalhanaja.sani.data.DriverDataRepository
import com.amalhanaja.sani.data.executor.JobExecutor
import com.amalhanaja.sani.data.repository.device.DeviceCache
import com.amalhanaja.sani.data.repository.driver.DriverCloud
import com.amalhanaja.sani.data.source.driver.DriverDataStoreFactory
import com.amalhanaja.sani.domain.executor.PostExecutionThread
import com.amalhanaja.sani.domain.executor.ThreadExecutor
import com.amalhanaja.sani.domain.repository.DriverRepository
import com.amalhanaja.sani.mobile.BuildConfig
import com.amalhanaja.sani.mobile.UiThread
import com.amalhanaja.sani.mobile.internal.di.scope.ApplicationScope
import dagger.Module
import dagger.Provides

/**
 * Created by doy on 11/5/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/5/17.
 */

@Module
open class ApplicationModule {
    @Provides
    @ApplicationScope
    fun provideContext(application: Application): Context =
            application

    /* PROVIDE REPOSITORIES BELOW */

    @Provides
    @ApplicationScope
    internal fun provideDriverRepository(factory: DriverDataStoreFactory): DriverRepository =
            DriverDataRepository(factory)

    /* PROVIDE REPOSITORIES ABOVE */

    /* PROVIDE CACHE BELOW */

    @Provides
    @ApplicationScope
    internal fun provideDeviceCache(session: DeviceSessionManager): DeviceCache =
            DeviceCacheImpl(session)

    /* PROVIDE CACHE ABOVE */



    /* PROVIDE CLOUD BELOW */

    @Provides
    @ApplicationScope
    internal fun provideDriverCloud(service: DriverService): DriverCloud =
            DriverCloudImpl(service)

//    @Provides
//    @ApplicationScope
//    internal fun provideUserCloud(service: UserService): DriverCloud =
//            UserCloudImpl(service)
//
//    @Provides
//    @ApplicationScope
//    internal fun provideDeviceCloud(service: DeviceService): DeviceCloud =
//            DeviceCloudImpl(service)

    /* PROVIDE CLOUD ABOVE */

    @Provides
    @ApplicationScope
    internal fun provideThreadExecutor(jobExecutor: JobExecutor): ThreadExecutor =
            jobExecutor

    @Provides
    @ApplicationScope
    internal fun providePostExecutionThread(uiThread: UiThread): PostExecutionThread =
            uiThread


    /* PROVIDE SESSION MANAGER BELOW */
//
//    @Provides
//    @ApplicationScope
//    internal fun provideDeviceSession(context: Context): DeviceSessionManager =
//            DeviceSessionManager(context)

    /* PROVIDE SESSION MANAGER ABOVE */

    /* PROVIDE SERVICE BELOW */

    @Provides
    @ApplicationScope
    internal fun provideDriverService(): DriverService =
            createService { DRIVER(BuildConfig.DEBUG) }


    /* PROVIDE SERVICE ABOVE */
}