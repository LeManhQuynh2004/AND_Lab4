package com.quynhlm.dev.and_lab4.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.quynhlm.dev.and_lab4.Fragments.Fragment1;
import com.quynhlm.dev.and_lab4.Fragments.Fragment2;

public class ViewPager_Adapter extends FragmentStateAdapter {
    public ViewPager_Adapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 0) {
            return new Fragment1();
        }
        return new Fragment2();
    }

    @Override
    public int getItemCount() {
        return 2;
    }
    //so luong phan tu
}
