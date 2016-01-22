package com.trioweb.remindme;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.trioweb.remindme.Fragments.AbstractTabFragment;
import com.trioweb.remindme.Fragments.BirthdaysFragment;
import com.trioweb.remindme.Fragments.HistoryFragment;
import com.trioweb.remindme.Fragments.IdeasFragment;
import com.trioweb.remindme.Fragments.ToDoFragment;

import java.util.HashMap;
import java.util.Map;

/**
 * Created on 22.01.2016.
 * @author Rakov Kirill
 */

public class CustomPagerAdapter extends FragmentPagerAdapter {
    private Context context;
    private Map<Integer, AbstractTabFragment> tabs;
    public CustomPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.tabs = new HashMap<>();
        this.context = context;
        this.tabs.put(0, HistoryFragment.getInstance(context));
        this.tabs.put(1, IdeasFragment.getInstance(context));
        this.tabs.put(2, ToDoFragment.getInstance(context));
        this.tabs.put(3, BirthdaysFragment.getInstance(context));
    }

    @Override
    public Fragment getItem(int i) {
        return this.tabs.get(i);
    }

    @Override
    public int getCount() {
        return this.tabs.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return this.tabs.get(position).getTitle();
    }
}
