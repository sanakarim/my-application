package com.example.dubaitourismtravel;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import coding.insight.login2.R;


public class splashscreen extends AppCompatActivity {
    Button started;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_splashscreen);

        started =(Button)findViewById(R.id.splash_button);

        started.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(splashscreen.this,login.class);
                startActivity(i);
            }
        });

    }
}