package com.example.android.linkidleproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.findViewById(R.id.basic);
        setContentView(R.layout.activity_main);
    }
}
