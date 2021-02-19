package com.example.gitdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv=findViewById(R.id.tv_name);
        tv.setText("Sandeep");
        tv.setText("Vishal");
        tv.setText("Twinkal");
        tv.setText("Titu");
        tv.setText("Khudal");
        tv.setText("Riyansh");
    }
}