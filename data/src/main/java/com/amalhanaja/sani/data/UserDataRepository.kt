package com.amalhanaja.sani.data

/**
 * Created by doy on 11/5/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/5/17.
 */
//class UserDataRepository
//@Inject constructor(private val factory: DriverDataStoreFactory)
//    : UserRepository {
//    override fun getUser(username: String, password: String, fcmToken: String): Observable<User> {
//        val dataStore = factory.retreiveDataStore()
//        return dataStore.getUser(username, password, fcmToken)
//                .flatMap {
//                    when (dataStore){
//                        is DriverCloudDataStore -> {
//                            saveUserEntity(it)
//                            return@flatMap Observable.just(it)
//                        }
//                        else -> {
//                            return@flatMap Observable.just(it)
//                        }
//                    }
//                }
//                .map { it.mapFromEntity() }
//    }
//
//    //    override fun getUser(username: String, deviceId: String, password: String): Observable<User> {
////        return dataStore.getUser(username, deviceId, password)
////                .flatMap {
////                    if (dataStore is DriverCloudDataStore){
////                        println("FROM CLOUD")
////                        saveUserEntity(it).toObservable()
////                    } else {
////                        println("FROM CACHE")
////                        Observable.just(it)
////                    }
////                }
////                .map {
////                    it.mapFromEntity()
////                }
////    }
//
//    override fun saveUser(user: User): Completable {
//        return saveUserEntity(user.mapToEntity())
//    }
//
//    override fun clearUser(): Completable {
//        return factory.retreiveCacheDataStore().clearUser()
//    }
//
//    private fun saveUserEntity(driverEntity: DriverEntity): Completable {
//        return factory.retreiveCacheDataStore().saveUser(driverEntity)
//    }
//
//
//    override val isLoggedIn: Boolean
//        get() = factory.retreiveDataStore().isLoggedIn
//}