package com.amalhanaja.sani.mobile.ui.fragment

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.View
import com.amalhanaja.sani.mobile.ui.activity.BaseActivity

/**
 * Created by doy on 11/5/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/5/17.
 */
abstract class BaseFragment: Fragment() {

    var _activity: BaseActivity? = null

    protected abstract fun setupView(view: View?)

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if (context is BaseActivity){
            _activity = context
            _activity?.onFragmentAttached()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupView(view)
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }

    override fun onDetach() {
        _activity = null
        super.onDetach()
    }

    interface Callback {
        fun onFragmentAttached()
        fun onFragmentDetached(tag: String)
    }
}