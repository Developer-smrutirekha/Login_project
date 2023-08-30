package com.example.welcome.userpage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.welcome.R;
import com.example.welcome.fragment.BlankFragment;
import com.example.welcome.fragment.BlankFragment2;
import com.example.welcome.fragment.BlankFragment3;

public class userworking extends AppCompatActivity {

    Button btnfraga,btnfragb,btnfragc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userworking);

        btnfraga=findViewById(R.id.btnfraga);
        btnfragb=findViewById(R.id.btnfragb);
        btnfragc=findViewById(R.id.btnfragc);

        btnfraga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                loadFrag(new BlankFragment());
            }
        });

        btnfragb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                loadFrag(new BlankFragment2());

            }
        });

        btnfragc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFrag(new BlankFragment3());
            }
        });
    }
    public  void loadFrag(Fragment fragment){
    FragmentManager fm=getSupportFragmentManager();
    FragmentTransaction FT=fm.beginTransaction();
                FT.add(R.id.container,fragment);
                FT.commit();
}
}