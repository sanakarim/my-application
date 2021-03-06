package com.example.dubaitourismtravel;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import coding.insight.login2.R;

public class dashboard2 extends AppCompatActivity {
    Button btnburj,btnrout,btnhistory,btnfeedbak,btnsetting,btnsupport;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_dashboard2);
        btnburj = (Button) findViewById(R.id.btnburj);
        btnrout = (Button) findViewById(R.id.btnrout);
        btnhistory = (Button) findViewById(R.id.btnhistory);
        btnfeedbak = (Button) findViewById(R.id.btnfeedbak);
        btnsetting = (Button) findViewById(R.id.btnsetting);
        btnsupport= (Button) findViewById((R.id.btnsupport));
        btnsupport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("tagged","goind to third screen");
                Intent intent = new Intent(dashboard2.this, village.class);
                startActivity(intent);
            }
        });
        btnsetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("tagged","goind to third screen");
                Intent intent = new Intent(dashboard2.this, mall.class);
                startActivity(intent);
            }
        });
        btnfeedbak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("tagged","goind to third screen");
                Intent intent = new Intent(dashboard2.this, Aquarism.class);
                startActivity(intent);
            }
        });
        btnburj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("tagged","goind to third screen");
                Intent intent = new Intent(dashboard2.this, burj.class);
                startActivity(intent);
            }
        });
        btnrout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("tagged","goind to third screen");
                Intent intent = new Intent(dashboard2.this, palm2.class);
                startActivity(intent);
            }
        });
        btnhistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("tagged","goind to third screen");
                Intent intent = new Intent(dashboard2.this, Arab.class);
                startActivity(intent);
            }
        });
        btnhistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("tagged","goind to third screen");
                Intent intent = new Intent(dashboard2.this, Arab.class);
                startActivity(intent);
            }
        });

    }

    public void profilebtn(View view) {
        Toast.makeText(this, "Profile Button Click", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onOptionsItemSelected(final MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}