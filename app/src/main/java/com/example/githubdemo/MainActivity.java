package com.example.githubdemo;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = findViewById(R.id.tv_name);
        tv.setText("This is a new");
        tv.setText("This is a new");
        tv.setText("This is a new");
        tv.setText("This is a new");

    }
}