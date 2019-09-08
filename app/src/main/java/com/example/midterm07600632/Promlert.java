package com.example.midterm07600632;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class Promlert extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promlert);
        String s = getIntent().getStringExtra("Welcome");
        Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT).show();
    }
}
