package com.amalhanaja.sani.cloud.network

/**
 * Created by doy on 11/10/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/10/17.
 */
class HttpClient {
    private val isDebug: Boolean = false

}
//class HttpClient {
//    private var _httpClient: OkHttpClient = OkHttpClient()
//    private var _moshi: Moshi = Moshi.Builder().build()
//    private var _baseUrl: String? = null
//
//    fun httpClient(isDebug: () -> Boolean, connectTimeout: (() -> Timeout)? = null, readTimeout: (() -> Timeout?)? = null, writeTimeout: (() -> Timeout?)? = null): OkHttpClient{
//        return OkHttpClient.Builder().apply {
//            val logging = HttpLoggingInterceptor()
//            when {
//                isDebug() -> {
//                    logging.level = HttpLoggingInterceptor.Level.BODY
//                }
//                else -> logging.level = HttpLoggingInterceptor.Level.NONE
//            }
//            addInterceptor(logging)
//        }.build()
//    }
//
//    class Timeout{
//        var time: Long = 0
//        var timeUnit: TimeUnit = TimeUnit.SECONDS
//    }
//
//}