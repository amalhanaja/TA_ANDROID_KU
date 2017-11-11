package com.amalhanaja.sani.cache.session

import android.content.Context
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by doy on 11/6/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/6/17.
 */
@Singleton
class DeviceSessionManager
@Inject constructor(context: Context){
    companion object {
        private val PREF_NAME = "DEVICE_SESSION"
        private val PREF_KEY_UUID = "UUID"
    }
    private val _pref = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)

    var deviceId: String
        get() = _pref.getString(PREF_KEY_UUID, "")
        set(value) = _pref.edit().putString(PREF_KEY_UUID, value).apply()
}