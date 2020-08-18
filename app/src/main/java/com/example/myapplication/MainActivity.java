package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView Talent;
    private TextView Signin;
    private TextView Hi;
    private TextView Email;
    private TextView pwd;
    private EditText emailtext;
    private EditText PWD;
    private Button SIGNIN;
    private TextView usesocialprofiles;
    private TextView Forgotpwd;
    private TextView signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Talent = (TextView) findViewById(R.id.textView);
        Signin = (TextView) findViewById(R.id.textView2);
        Hi = (TextView) findViewById(R.id.textView3);
        Email = (TextView) findViewById(R.id.textView4);
        pwd = (TextView) findViewById(R.id.textView5);
        emailtext = (EditText) findViewById(R.id.editTextTextEmailAddress);
        PWD = (EditText) findViewById(R.id.editTextNumberPassword);
        usesocialprofiles = (TextView) findViewById(R.id.textView6);
        Forgotpwd = (TextView) findViewById(R.id.textView7);
        signup = (TextView) findViewById(R.id.textView8);

        SIGNIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(emailtext.getText().toString(), PWD.getText().toString());
            }
        });
    }

    //Create the Validate Function
    private void validate(String userEmail, String userPWD) {
        if ((userEmail.equals("HowCreateIt")) && (userPWD.equals("Yes"))) {
             //Intent intent = new Intent(MainActivity.this, SigninpageActivity.class);
            // startActivity(intent);
        } else {
            //wrong password
        }
    }
}