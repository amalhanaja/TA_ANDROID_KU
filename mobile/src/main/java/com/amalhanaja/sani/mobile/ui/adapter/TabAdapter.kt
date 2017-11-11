package com.amalhanaja.sani.mobile.ui.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

/**
 * Created by doy on 11/8/17.
 * Email : amalhanaja@gmail.com
 * Created On : 11/8/17.
 */
class TabAdapter(fm: FragmentManager?) : FragmentPagerAdapter(fm) {

    private val fragments = mutableListOf<Fragment>()
    private val titles = mutableListOf<String>()

    override fun getItem(position: Int): Fragment =
            fragments[position]

    override fun getCount(): Int =
            fragments.size
    override fun getPageTitle(position: Int): CharSequence =
            titles[position]

    fun addFragment(fragment: Fragment, title: String){
        fragments.add(fragment)
        titles.add(title)
    }
}