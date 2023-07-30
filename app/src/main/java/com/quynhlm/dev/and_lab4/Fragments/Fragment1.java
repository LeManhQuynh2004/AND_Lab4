package com.quynhlm.dev.and_lab4.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.quynhlm.dev.and_lab4.R;

public class Fragment1 extends Fragment {

    View view;

    TextView txtNhan;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_1, container, false);
        txtNhan = view.findViewById(R.id.txtNhanVe);
        return view;
    }
}