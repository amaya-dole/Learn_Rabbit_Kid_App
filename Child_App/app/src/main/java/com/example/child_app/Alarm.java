package com.example.child_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Alarm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);
    }
}