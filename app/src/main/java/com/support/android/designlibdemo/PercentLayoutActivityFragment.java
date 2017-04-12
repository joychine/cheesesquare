package com.support.android.designlibdemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A placeholder fragment containing a simple view.
 */
public class PercentLayoutActivityFragment extends Fragment {

    public PercentLayoutActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.fragment_percent_layout, container, false);
        return inflater.inflate(R.layout.layout_percent, container, false);
    }
}
