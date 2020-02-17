package com.example.foster.data;



import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

public class FosterAdapter extends FragmentPagerAdapter {

    public FosterAdapter(FragmentManager fm) {
        super(fm);

    }

    String[] titles = {"Allcourse", "DataScience", "FullStack", "WebApps", "Devops"};


    @Override
    public Fragment getItem(int position) {

        switch (position) {

            case 0: {
                return FosterFragment.newInstance(DataGenerator.getTab1Data());

            }

            case 1: {
                return FosterFragment.newInstance(DataGenerator.getTab1Data());

            }

            case 2: {
                return FosterFragment.newInstance(DataGenerator.getTab1Data());

            }

            case 3: {
                return FosterFragment.newInstance(DataGenerator.getTab1Data());

            }

            default:
                return FosterFragment.newInstance(DataGenerator.getTab1Data());


        }
    }

    @Override
    public int getCount() {
        return titles.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
