package com.binatika.deteksigolongandarah.realm;

import android.app.Activity;

import com.binatika.deteksigolongandarah.model.GejalaPenyakitModel;
import com.binatika.deteksigolongandarah.model.GolonganDarahModel;
import com.binatika.deteksigolongandarah.model.HasilPenyakitModel;
import com.binatika.deteksigolongandarah.model.PenyakitModel;
import com.binatika.deteksigolongandarah.model.UserModel;
import com.binatika.deteksigolongandarah.util.UserPreference;

import io.realm.Realm;

/**
 * Created by dev_deny on 3/26/17.
 */

public class InsertData {

    public Realm realm;
    public Activity activity;
    UserPreference userPreference;

    public InsertData(Activity act){
        activity = act;
        userPreference = UserPreference.getInstance(act);
        realm = RealmController.with(activity).getRealm();

        RealmController.with(activity).refresh();
        initUser();
        initGejala();
        initPenyakit();
        initGolonganDarah();
        initHasil();

        userPreference.setInput(true);
    }

    public void initUser(){
        for (UserModel b : DataUser.inputUser(activity)) {
            realm.beginTransaction();
            realm.copyToRealm(b);
            realm.commitTransaction();
        }
    }

    public void initGejala(){
        for (GejalaPenyakitModel b : DataGejala.gejalaPenyakitModels(activity)) {
            realm.beginTransaction();
            realm.copyToRealm(b);
            realm.commitTransaction();
        }
    }

    public void initPenyakit(){
        for (PenyakitModel b : DataPenyakit.getPenyakitModels(activity)) {
            realm.beginTransaction();
            realm.copyToRealm(b);
            realm.commitTransaction();
        }
    }

    public void initGolonganDarah(){
        for (GolonganDarahModel b : DataGolonganDarah.getGolonganModels(activity)) {
            realm.beginTransaction();
            realm.copyToRealm(b);
            realm.commitTransaction();
        }
    }

    public void initHasil(){
        for (HasilPenyakitModel b : DataHasil.getHasil(activity)) {
            realm.beginTransaction();
            realm.copyToRealm(b);
            realm.commitTransaction();
        }
    }
}
