package com.example.sdklibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.facebook.rebound.BouncyConversion;


public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        new BouncyConversion(1, 1);
    }
}