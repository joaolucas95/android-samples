package com.example.mapdemo;

import android.app.Application;
import android.os.StrictMode;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        enableStrictMode();
    }

    private void enableStrictMode() {
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder()
                .detectAll()
                .penaltyLog()
                .build());
        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder()
                .detectAll()
                .penaltyLog()
                .build());
    }
}