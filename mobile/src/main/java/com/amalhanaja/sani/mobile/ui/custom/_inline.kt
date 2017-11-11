package com.amalhanaja.sani.mobile.ui.custom

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import com.amalhanaja.sani.mobile.ui.activity.BaseActivity

/**
 * Created by doy on 11/5/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/5/17.
 */

inline fun TextView.textWatcher(init: DefaultTextWatcher.() -> Unit) { addTextChangedListener(DefaultTextWatcher().apply(init)) }
inline fun <reified T: BaseActivity> Context.to(argument: HashMap<String, Any>) {
    val intent = Intent(this, T::class.java)
    val bundle = Bundle()
    argument.forEach({
        with(it){
            when(value){
                is String -> bundle.putString(key, value as String)
                is Int -> intent.putExtra(key, value as Int)
                else -> throw IllegalArgumentException()
            }
        }
    })
    startActivity(intent)
}