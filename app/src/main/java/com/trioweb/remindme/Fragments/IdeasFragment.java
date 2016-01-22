package com.trioweb.remindme.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.trioweb.remindme.R;

/**
 * Created on 22.01.2016.
 * @author Rakov Kirill
 */

public class IdeasFragment extends AbstractTabFragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.example_fragment_layout, container, false);
        return view;
    }

    public static IdeasFragment getInstance(Context context){
        Bundle bundle = new Bundle();
        IdeasFragment fragment = new IdeasFragment();
        fragment.setArguments(bundle);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.tab_item_ideas));
        return fragment;
    }
}
