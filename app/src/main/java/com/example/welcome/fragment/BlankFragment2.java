package com.example.welcome.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.welcome.R;


public class BlankFragment2 extends Fragment {


    public BlankFragment2() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_blank2, container, false);
        TextView textView=view.findViewById(R.id.txtfragg);
        return view;

    }
}