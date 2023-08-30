package com.example.welcome.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.welcome.R;


public class BlankFragment extends Fragment {


    public BlankFragment() {

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

         View view =  inflater.inflate(R.layout.fragment_blank, container, false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        TextView txt=view.findViewById(R.id.txt);

        return view;



    }
}