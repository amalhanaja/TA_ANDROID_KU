package com.amalhanaja.sani.cloud.service

import com.amalhanaja.sani.cloud.baseUrl
import com.amalhanaja.sani.cloud.converterFactory
import com.amalhanaja.sani.cloud.create
import com.amalhanaja.sani.cloud.httpClient

/**
 * Created by doy on 11/5/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/5/17.
 */

object ServiceFactory {
    val TOKEN: (Boolean) -> TokenService = {
        create(httpClient { DEFAULT(it) },
                baseUrl { TOKEN },
                converterFactory { MOSHI_KOTLIN })
    }
    val DRIVER: (Boolean) -> DriverService = {
        create(httpClient { DEFAULT(it) },
                baseUrl { DRIVER },
                converterFactory { MOSHI_KOTLIN })
    }
}