package com.example.welcome.registationpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.welcome.R;
import com.example.welcome.userpage.userworking;

import java.util.regex.Pattern;


public class Registration extends AppCompatActivity {
    private EditText inputusername,EmailAddress,mobilePhone,inputPassword,confirmPassword;

    private Button button;
    private Pattern patternforemail = Patterns.EMAIL_ADDRESS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        inputusername = findViewById(R.id.inputusername);
        EmailAddress = findViewById(R.id.EmailAddress);
        mobilePhone = findViewById(R.id.mobilePhone);
        inputPassword = findViewById(R.id.inputPassword);
        confirmPassword = findViewById(R.id.confirmPassword);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {
                String username = inputusername.getText().toString();
                String email = EmailAddress.getText().toString();
                String phone = mobilePhone.getText().toString();
                String password = inputPassword.getText().toString();
                String confirm = confirmPassword.getText().toString();

                if (username.equals("")) {
                    inputusername.setError("Enter your user name");
                } else if (email.equals("") || !patternforemail.matcher(email).matches()) {
                    EmailAddress.setError("Enter your email id");
                } else if (phone.equals("")) {
                    mobilePhone.setError("Enter your mobile number");

                } else if (password.equals("")) {
                    inputPassword.setError("Enter your password");
                } else if (confirm.equals("")) {
                    confirmPassword.setError("Confirm your password");
                } else if (!confirm.equals(password)) {
                    confirmPassword.setError("Enter your valid password");
                } else {
                    Toast.makeText(Registration.this, "Registration is succeessful!", Toast.LENGTH_SHORT).show();
                    Intent Next;
                    Next=new Intent(Registration.this, userworking.class);
                    startActivity(Next);
                }
            }
        });
    }
}