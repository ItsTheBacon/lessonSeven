package com.example.lessonseven;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.List;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    List<OnBoradingModel> list;

    public ViewPagerAdapter(@NonNull  FragmentManager fm, List<OnBoradingModel> list) {
        super(fm);
        this.list = list;
    }

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {
        return OnBoardingFragment.newInstance(list.get(position).getTitle(), list.get(position).getDescripton(), list.get(position).getImage());

    }

    @Override
    public int getCount() {
        return list.size();
    }
}
