package com.c360.celsius.trupka.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.c360.celsius.trupka.R;

/**
 * Created by dennisshar on 23/02/2018.
 */

public class FavoriteContactsFragment extends Fragment {

    public final static String TAG = "FavoriteContactsFragment";


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_favorites, container, false);
        return view;
    }
}
