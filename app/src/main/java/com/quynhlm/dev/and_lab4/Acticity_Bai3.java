package com.quynhlm.dev.and_lab4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.quynhlm.dev.and_lab4.Adapter.ViewPager_Adapter;

public class Acticity_Bai3 extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager2 viewPager2;
    ViewPager_Adapter viewPager_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);
        tabLayout = findViewById(R.id.TabLayout);
        viewPager2 = findViewById(R.id.ViewPager2);
        viewPager_adapter = new ViewPager_Adapter(this);
        viewPager2.setAdapter(viewPager_adapter);
//        new TabLayoutMediator(tabLayout, viewPager2, (tab, position) -> {
//            tab.setText("Tab " + position);
//        }).attach();
        new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position){
                    case 0:
                        tab.setText("Tab 1");
                        break;
                    case 1:
                        tab.setText("Tab 2");
                        break;
                }
            }
        }).attach();
    }
}