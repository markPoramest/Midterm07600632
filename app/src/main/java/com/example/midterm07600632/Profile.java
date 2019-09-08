package com.example.midterm07600632;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        String s = getIntent().getStringExtra("Welcome");
        Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT).show();
        String name = getIntent().getStringExtra("Name");
        String Lives = getIntent().getStringExtra("Lives");
        String From = getIntent().getStringExtra("From");
        String School = getIntent().getStringExtra("School");
        TextView N = findViewById(R.id.Promlert);
        TextView L = findViewById(R.id.Lives);
        TextView F = findViewById(R.id.From);
        TextView S = findViewById(R.id.School);
        N.setText(name);
        L.setText(Lives);
        F.setText(From);
        S.setText(School);
    }
}
