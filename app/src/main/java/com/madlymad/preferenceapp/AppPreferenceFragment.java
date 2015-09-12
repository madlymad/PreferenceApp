package com.madlymad.preferenceapp;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.preference.PreferenceFragmentCompat;
import android.view.View;

/**
 * Default parent class that fixes the color of the background of the fragment.
 * <p/>
 * Created by madlymad on 12/9/2015.
 */
public abstract class AppPreferenceFragment extends PreferenceFragmentCompat {

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Set the default white background in the view so as to avoid transparency
        view.setBackgroundColor(
                ContextCompat.getColor(getContext(), R.color.background_material_light));

    }
}
