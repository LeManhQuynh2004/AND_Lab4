package com.quynhlm.dev.and_lab4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.quynhlm.dev.and_lab4.Fragments.Fragment1;
import com.quynhlm.dev.and_lab4.Fragments.Fragment2;

public class Activity_Bai2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container1,new Fragment1(),"message").commit();
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container2,new Fragment2()).commit();
    }
}