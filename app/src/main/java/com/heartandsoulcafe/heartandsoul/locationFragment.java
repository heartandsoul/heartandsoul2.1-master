package com.heartandsoulcafe.heartandsoul;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class locationFragment extends Fragment implements OnMapReadyCallback {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_location, container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        SupportMapFragment fragment = SupportMapFragment.newInstance();
        getChildFragmentManager().findFragmentById(R.id.map);
        fragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {




       LatLng marker = new LatLng(-34.05327277, 151);
        //<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d206.60190291099983!2d151.15329595555326!3d-34.053349596509285!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x91b541e6c1860f6d!2sHeart+%26+Soul+Organic+Chai+Cafe!5e0!3m2!1sen!2sau!4v1492947186280" width="400" height="300" frameborder="0" style="border:0" allowfullscreen></iframe>
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(marker, 20));

        googleMap.addMarker(new MarkerOptions().title("Heart and soul location!").position(marker));
    }


}
