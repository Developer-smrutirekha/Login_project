package com.example.welcome.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.welcome.R;


public class BlankFragment3 extends Fragment {


    public BlankFragment3() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_blank3, container, false);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView textView=view.findViewById(R.id.txtt);
        return view;

    }
}