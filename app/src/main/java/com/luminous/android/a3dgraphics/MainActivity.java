package com.luminous.android.a3dgraphics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private MyView myView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        // hide title bar
        getSupportActionBar().hide();

        myView = new MyView(this);
        setContentView(myView);
    }


}
