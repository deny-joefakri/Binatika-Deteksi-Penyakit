package com.binatika.deteksigolongandarah;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;


public class MyApp extends Application {

    @Override
    public void onCreate() {

        super.onCreate();
        RealmConfiguration realmConfiguration = new RealmConfiguration.Builder(this)
                .name("binatika.realm")
                .schemaVersion(0)
                .deleteRealmIfMigrationNeeded()
                .build();
        Realm.setDefaultConfiguration(realmConfiguration);

    }
}
