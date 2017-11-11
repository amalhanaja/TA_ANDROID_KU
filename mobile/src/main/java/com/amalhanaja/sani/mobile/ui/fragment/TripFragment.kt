package com.amalhanaja.sani.mobile.ui.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.amalhanaja.sani.mobile.R
import kotlinx.android.synthetic.main.fragment_trip.*

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [TripFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [TripFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class TripFragment : Fragment() {

    companion object {
        fun newInstance(): TripFragment {
            val args = Bundle()
            val fragment = TripFragment()
            fragment.arguments = args
            return fragment
        }
    }

    private var _listener: OnTripInteraction? = null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater!!.inflate(R.layout.fragment_trip, container, false)
        btn_logout.setOnClickListener {
            _listener?.OnClick(it)
        }
        return view
    }

    interface OnTripInteraction {
        fun OnClick(v: View)
    }

}
