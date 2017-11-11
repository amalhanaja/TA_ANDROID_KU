package com.amalhanaja.sani.cloud

import com.amalhanaja.sani.cloud.model.utility.Config
import com.amalhanaja.sani.cloud.service.ServiceFactory
import okhttp3.OkHttpClient
import retrofit2.Converter
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory

/**
 * Created by doy on 11/5/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/5/17.
 */


fun httpClient(init: Config.HttpClient.() -> OkHttpClient): OkHttpClient =
        Config.HttpClient.init()

fun baseUrl(init: Config.BaseUrl.() -> String) =
        Config.BaseUrl.init()

fun converterFactory(init: Config.ConverterFactory.() -> Converter.Factory) =
        Config.ConverterFactory.init()

inline fun <reified T>create(client: OkHttpClient, baseUrl: String, converterFactory: Converter.Factory):  T =
        Retrofit.Builder()
            .baseUrl(baseUrl)
            .client(client)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(converterFactory)
            .build()
            .create(T::class.java)

inline fun <reified T> createService(init: ServiceFactory.() -> T): T =
        ServiceFactory.init()