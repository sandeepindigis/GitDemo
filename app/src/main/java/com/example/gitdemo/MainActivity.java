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
        TextView tv1=findViewById(R.id.tv_namee);
        tv.setText("Sandeep");
        tv.setText("Vishal");
        tv1.setText("Add New Text View");
       /* tv.setText("Twinkal");
        tv.setText("Titu");
        tv.setText("New Member");
        /*tv.setText("Lala");
        tv.setText("Nikki");
        tv.setText("Khudal");
        tv.setText("Riyansh");
        tv.setText("New Name");
        tv.setText("Add Another Name");*/
    }
}