package com.trioweb.remindme;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created on 22.01.2016.
 * @author Rakov Kirill
 */

public class CustomPagerAdapter extends FragmentPagerAdapter {
    private String[] tabs = new String[]{
            "Tab 1",
            "Напоминания",
            "Tab 1"
    };
    public CustomPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0: return ExampleFragment.getInstance();
            case 1: return ExampleFragment.getInstance();
            case 2: return ExampleFragment.getInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return this.tabs.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return this.tabs[position];
    }
}
