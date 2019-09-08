package com.example.midterm07600632;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button login = findViewById(R.id.Login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView u1 = findViewById(R.id.user);
                TextView p1 = findViewById(R.id.Pass);
                String user = u1.getText().toString();
                String pass = p1.getText().toString();
                if (user.equals("aaa") && pass.equals("111"))
                {
                    Intent i1 = new Intent(getApplicationContext(),Profile.class);
                    i1.putExtra("Welcome",getString(R.string.Welcome)+" "+getString(R.string.Poramest));
                    i1.putExtra("Name",getString(R.string.Poramest));
                    i1.putExtra("School","กาญจนาภิเษกวิทยาลัย นครปฐม");
                    i1.putExtra("Lives","นครปฐม");
                    i1.putExtra("From","กรุงเทพมหานคร");

                    startActivity(i1);
                }
                else if (user.equals("bbb") && pass.equals("222"))
                {
                    Intent i1 = new Intent(getApplicationContext(), Profile.class);
                    i1.putExtra("Welcome",getString(R.string.Welcome)+" "+getString(R.string.Promlert));
                    i1.putExtra("Name",getString(R.string.Promlert));
                    i1.putExtra("School","สวนกุหลาบวิทยาลัย");
                    i1.putExtra("Lives","กรุงเทพมหานคร");
                    i1.putExtra("From","กรุงเทพมหานคร");
                    startActivity(i1);
                }
                else
                {
                    AlertDialog.Builder alert1 = new AlertDialog.Builder(MainActivity.this);
                    //alert1.setTitle("Invalid");
                    alert1.setMessage(R.string.Invalid);
                    alert1.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    alert1.show();
                }
            }
        });


    }
}
