package com.amalhanaja.sani.data

import com.amalhanaja.sani.data.source.driver.DriverDataStoreFactory
import com.amalhanaja.sani.domain.repository.DriverRepository
import io.reactivex.Completable
import javax.inject.Inject

/**
 * Created by doy on 11/11/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/11/17.
 */
class DriverDataRepository
@Inject constructor(private val factory: DriverDataStoreFactory)
    : DriverRepository {

    override fun login(username: String, password: String, fcmToken: String): Completable {
        val dataStore = factory.retreiveDataStore()
        return Completable.fromObservable(dataStore.login(username, password, fcmToken))
    }
}