package com.binatika.deteksigolongandarah;

import android.app.Application;
import android.os.StrictMode;

import com.squareup.leakcanary.LeakCanary;


public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG){
            if (LeakCanary.isInAnalyzerProcess(this)) {
                return;
            }
            enabledStrictMode();
            LeakCanary.install(this);
        }
    }

    private static void enabledStrictMode() {
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder() //
                .detectAll() //
                .penaltyLog() //
                .penaltyDeath() //
                .build());
    }
}
