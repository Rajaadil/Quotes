package com.madhatters.quotes;


import android.support.annotation.Nullable;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import android.view.ViewGroup;
import android.widget.TextView;

import java.util.zip.Inflater;

public class PagerFragment extends Fragment{
    private String day;
    private String random;
    private String previous;
    public static PagerFragment newInstance(String day, String random, String previous) {
        Bundle bundle=new Bundle();
        PagerFragment pagerFragment=new PagerFragment();
        pagerFragment.day=day;
        pagerFragment.random=random;
        pagerFragment.previous=previous;
        pagerFragment.setArguments(bundle);
        return pagerFragment;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,@Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment, container, false);
        TextView tvPageday = view.findViewById(R.id.day);
        TextView tvpageayyat = view.findViewById(R.id.ayyat);
        TextView tvpageayyats = view.findViewById(R.id.ayyats);
        tvPageday.setText(day);
        tvpageayyat.setText(random);
        tvpageayyats.setText(previous);
        return view;
    }
}
