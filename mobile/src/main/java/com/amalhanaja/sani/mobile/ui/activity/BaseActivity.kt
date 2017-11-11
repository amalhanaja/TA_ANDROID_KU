package com.amalhanaja.sani.mobile.ui.activity

import android.annotation.TargetApi
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.amalhanaja.sani.mobile.ui.fragment.BaseFragment
import dagger.android.AndroidInjection

/**
 * Created by doy on 11/5/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/5/17.
 */
abstract class BaseActivity: AppCompatActivity(), BaseFragment.Callback {

    protected abstract val layoutResource: Int
    protected abstract fun setupView()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutResource)
        initializeInjector()
        setupView()
    }

    private fun initializeInjector() {
        AndroidInjection.inject(this)
    }

    @TargetApi(Build.VERSION_CODES.M)
    fun requestPermissionsSafely(permissions: Array<String>, requestCode: Int){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
            requestPermissions(permissions, requestCode)
        }
    }

    @TargetApi(Build.VERSION_CODES.M)
    fun hasPermission(permission: String): Boolean =
            Build.VERSION.SDK_INT < Build.VERSION_CODES.M ||
                    checkSelfPermission(permission) == PackageManager.PERMISSION_GRANTED

    override fun onFragmentAttached() {

    }

    override fun onFragmentDetached(tag: String) {

    }
}