package com.c360.celsius.trupka;

import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        Intent i = new Intent(getBaseContext(), MainActivity.class);
        startActivity(i);

    }
}
