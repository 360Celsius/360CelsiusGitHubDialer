package com.c360.celsius.trupka.backgroundservice;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;

public class BackGroundService extends IntentService {


    public BackGroundService() {
        super("BackGroundService");
    }


    public BackGroundService(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {

    }
}
