package com.trioweb.remindme.Fragments;

import android.content.Context;
import android.support.v4.app.Fragment;

/**
 * Created on 22.01.2016.
 * @author Rakov Kirill
 */

abstract public class AbstractTabFragment extends Fragment{
    private String title;
    protected Context context;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
