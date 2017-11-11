package com.amalhanaja.sani.mobile.ui.custom

import android.widget.TextView
import com.amalhanaja.sani.mobile.ui.fragment.TripFragment

/**
 * Created by doy on 11/5/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/5/17.
 */

inline fun TextView.textWatcher(init: DefaultTextWatcher.() -> Unit) { addTextChangedListener(DefaultTextWatcher().apply(init)) }
inline fun TripFragment.onClickListener(init: TripFragment.() -> Unit) = {

}
