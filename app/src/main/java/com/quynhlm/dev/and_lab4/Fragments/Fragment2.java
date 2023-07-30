package com.quynhlm.dev.and_lab4.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.quynhlm.dev.and_lab4.R;

public class Fragment2 extends Fragment {
    View view;

    EditText edtmessage;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_2, container, false);
        edtmessage = view.findViewById(R.id.edt_message);
        view.findViewById(R.id.btnSend).setOnClickListener(v -> {
            String message = edtmessage.getText().toString().trim();
            FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
            Fragment1 fragment1 = (Fragment1) fragmentManager.findFragmentByTag("message");
            if (fragment1 != null) {
                fragment1.txtNhan.setText(message);
            }
        });
        return view;
    }
}