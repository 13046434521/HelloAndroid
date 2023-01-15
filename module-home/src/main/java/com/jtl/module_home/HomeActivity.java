package com.jtl.module_home;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Observable;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        getLifecycle().addObserver(new HomeLifeObserver());



    }
}