package com.prac.hybrid.shophop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Backend extends AppCompatActivity {
    TextView fgpass;
    Button login, signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frontend);
        fgpass=findViewById(R.id.fgpass);
        fgpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it2 = new Intent(Backend.this, Verification.class);
            }
        });

        login= (Button)findViewById(R.id.login);
        signup = (Button)findViewById(R.id.signup);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it= new Intent(Backend.this,MainActivity.class);
                startActivity(it);


            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it1= new Intent(Backend.this,Verification.class);
                startActivity(it1);
            }
        });


    }
}
