package com.amalhanaja.sani.mobile.ui.activity

import android.content.pm.PackageManager
import android.location.Location
import com.amalhanaja.sani.mobile.R
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import kotlinx.android.synthetic.main.activity_maps.*
import timber.log.Timber

class MapsActivity: BaseActivity(), OnMapReadyCallback {

    companion object {
        private val REQ_CODE_ACCESS_FINE_LOCATION = 1
    }

    private lateinit var _map: GoogleMap
    private var isLocationPermissionGranted: Boolean = false
    private val _fusedLocationProviderClient by lazy {
        LocationServices.getFusedLocationProviderClient(this)
    }
    private var _lastLocation: Location? = null

    override val layoutResource: Int
        get() = R.layout.activity_maps

    override fun setupView() {
        (map as SupportMapFragment)
                .getMapAsync(this)
        if (hasPermission(android.Manifest.permission.ACCESS_FINE_LOCATION)){
            isLocationPermissionGranted = true
            getDeviceLocation()
        } else {
            requestPermissionsSafely(arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION), REQ_CODE_ACCESS_FINE_LOCATION)
        }
    }

    private fun getDeviceLocation() {
        _fusedLocationProviderClient.lastLocation
                .addOnCompleteListener(this, {
                    when {
                        it.isSuccessful && it.result != null -> {
                            _lastLocation = it.result
                            _map.moveCamera(CameraUpdateFactory
                                    .newLatLngZoom(LatLng(_lastLocation!!.latitude,
                                            _lastLocation!!.longitude),
                                            13f)
                            )
                        }
                        else -> {
                            Timber.e(it.exception, it.exception?.message)
                        }
                    }
                })
    }

    override fun onMapReady(map: GoogleMap) {
        _map = map
        _map.isMyLocationEnabled = isLocationPermissionGranted
        _map.isTrafficEnabled = true
        _map.uiSettings.isMyLocationButtonEnabled = true
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        when(requestCode){
            REQ_CODE_ACCESS_FINE_LOCATION -> {
                isLocationPermissionGranted = grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED
            }
        }
    }
}

//class MapsActivity : AppCompatActivity(), OnMapReadyCallback {
//
//    private lateinit var mMap: GoogleMap
//    private val adapter = TabAdapter(supportFragmentManager)
//    private lateinit var _behaviour: BottomSheetBehavior<View>
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_maps)
//        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
////        val mapFragment = supportFragmentManager
////                .findFragmentById(R.id.map) as SupportMapFragment
//        (map as SupportMapFragment).getMapAsync(this)
//        adapter.addFragment(TripFragment(), "Trip")
//        adapter.addFragment(TripFragment(), "Road")
//        adapter.addFragment(TripFragment(), "Truck")
//        view_pager.adapter = adapter
//        tabs.setupWithViewPager(view_pager)
//        _behaviour = BottomSheetBehavior.from(bottom_sheet)
//        tabs.addOnTabSelectedListener(object: TabLayout.OnTabSelectedListener {
//            override fun onTabReselected(tab: TabLayout.Tab?) {
//                _behaviour.state = BottomSheetBehavior.STATE_COLLAPSED
//            }
//
//            override fun onTabUnselected(tab: TabLayout.Tab?) {
//
//            }
//
//            override fun onTabSelected(tab: TabLayout.Tab?) {
//                _behaviour.state = BottomSheetBehavior.STATE_COLLAPSED
//            }
//        })
//
//    }
//
//    override fun dispatchTouchEvent(event: MotionEvent?): Boolean {
//        if (event?.action == MotionEvent.ACTION_DOWN) {
//            if (_behaviour.state == BottomSheetBehavior.STATE_EXPANDED) {
//
//                val outRect = Rect()
//                bottom_sheet.getGlobalVisibleRect(outRect)
//
//                if (!outRect.contains(event.rawX.toInt(), event.rawY.toInt()))
//                    _behaviour.state = BottomSheetBehavior.STATE_COLLAPSED
//            }
//        }
//
//        return super.dispatchTouchEvent(event)
//    }
//
//    /**
//     * Manipulates the map once available.
//     * This callback is triggered when the map is ready to be used.
//     * This is where we can add markers or lines, add listeners or move the camera. In this case,
//     * we just add a marker near Sydney, Australia.
//     * If Google Play services is not installed on the device, the user will be prompted to install
//     * it inside the SupportMapFragment. This method will only be triggered once the user has
//     * installed Google Play services and returned to the app.
//     */
//    override fun onMapReady(googleMap: GoogleMap) {
//        mMap = googleMap
//
//        // Add a marker in Sydney and move the camera
//        val sydney = LatLng(-34.0, 151.0)
//        mMap.addMarker(MarkerOptions().position(sydney).title("Marker in Sydney"))
//        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney))
//    }
//}
