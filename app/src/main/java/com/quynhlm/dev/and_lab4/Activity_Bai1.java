package com.quynhlm.dev.and_lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.quynhlm.dev.and_lab4.Fragments.Fragment1;
import com.quynhlm.dev.and_lab4.Fragments.Fragment2;

public class Activity_Bai1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Fragment1()).commit();
        findViewById(R.id.btnFragmnet1).setOnClickListener(v -> {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Fragment1()).commit();
        });
        findViewById(R.id.btnFragmnet2).setOnClickListener(v -> {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Fragment2()).commit();
        });
    }
}