package com.example.caller;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {
    int no_of_tabs;
    public PageAdapter(FragmentManager fm,int no) {
        super(fm);
        this.no_of_tabs=no;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return new Home();
            case 1:
                return new Movie();
                case 2:
            return new Sports();
            case 3:
                return new WebApp();
            case 4:
                return new Devops();

            default:
                return null;

        }

    }

    @Override
    public int getCount() {
        return no_of_tabs;
    }
}
