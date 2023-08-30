package com.example.welcome.bottonnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.welcome.R;

public class bottomnavigation extends AppCompatActivity {
bottomnavigation bnview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.botttomnavigation);


        bnview = findViewById(R .id.bnview);

        bnview.setOnNavigationItemSelectedListener(new bottomnavigation.OnNavigationItemSelected);
@Override
        public boolean onNavigationItemSelected(@NonNull  MenuItem item){

    int id=item.getItemId();


    if(id==R.home){
      loadFrag(new fragmenta(),false);
    } else if (id==R.profile) {
        loadFrag(new fragmentb(),false);
    } else if (id==R.support) {
        loadFrag(new fragmentc(),false);
    } else  (id==R.setting) {
        loadFrag(new fragmentd(),true);
    }
            return true:
        }

    }

    private void setOnNavigationItemSelectedListener(bottomnavigation. onNavigationItemSelectedListener); {
    });
app_bar.setSelectedItem(R.id.home);
}

        public  void loadFrag(Fragment fragment,boolean flag){
            FragmentManager fm=getSupportFragmentManager();
            FragmentTransaction FT=fm.beginTransaction();

            if(flag)
               FT.add(R.id.container,fragment);
            else
            FT.add(R.id.container,fragment);
            FT.commit();
    }

    }