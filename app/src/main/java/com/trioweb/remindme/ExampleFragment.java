package com.trioweb.remindme;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created on 22.01.2016.
 * @author Rakov Kirill
 */

public class ExampleFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.example_fragment_layout, container, false);
        return view;
    }

    public static ExampleFragment getInstance(){
        Bundle bundle = new Bundle();
        ExampleFragment fragment = new ExampleFragment();
        fragment.setArguments(bundle);
        return fragment;
    }
}
