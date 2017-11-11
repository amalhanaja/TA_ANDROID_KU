package com.amalhanaja.sani.cloud.model.utility

import com.squareup.moshi.KotlinJsonAdapterFactory
import com.squareup.moshi.Moshi
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.converter.moshi.MoshiConverterFactory

/**
 * Created by doy on 11/5/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/5/17.
 */
object Config {
    object BaseUrl {
        val DEVICE = "http://192.168.1.14:5005/"
        val USER = "http://192.168.1.14:5002/"
        val TOKEN = "http://192.168.1.14:5002/"
        val DRIVER = "http://192.168.1.14:5001/"
    }
    object HttpClient {
        val DEFAULT: (Boolean) -> OkHttpClient = { isDebug: Boolean ->
            OkHttpClient.Builder().apply {
                val logging = HttpLoggingInterceptor()
                when {
                    isDebug -> logging.level = HttpLoggingInterceptor.Level.BODY
                    else -> logging.level = HttpLoggingInterceptor.Level.NONE
                }
                addInterceptor(logging)
            }.build()
        }
    }
    object ConverterFactory {
        val MOSHI_KOTLIN = MoshiConverterFactory.create(Moshi.Builder()
                .add(KotlinJsonAdapterFactory())
                .build())
    }
}