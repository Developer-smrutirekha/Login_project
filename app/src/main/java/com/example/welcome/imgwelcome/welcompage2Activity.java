package com.example.welcome.imgwelcome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.welcome.R;
import com.example.welcome.registationpage.Registration;

public class welcompage2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcompage2);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent Next;
                Next=new Intent(welcompage2Activity.this, Registration.class);
                startActivity(Next);
                finish();
            }

        },3000);



    }
}