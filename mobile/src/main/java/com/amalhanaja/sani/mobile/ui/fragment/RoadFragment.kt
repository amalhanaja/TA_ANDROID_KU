package com.amalhanaja.sani.mobile.ui.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.amalhanaja.sani.mobile.R


/**
 * A simple [Fragment] subclass.
 * Use the [RoadFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class RoadFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_road, container, false)
    }

    companion object {
        fun newInstance(): RoadFragment {
            val fragment = RoadFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }

}// Required empty public constructor
