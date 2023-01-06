package com.an.ansearchspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.an.ansearchablespinner.SearchableSpinner;

public class MainActivity extends AppCompatActivity {
    SearchableSpinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}