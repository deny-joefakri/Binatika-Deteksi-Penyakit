package com.binatika.deteksigolongandarah.realm;


import android.app.Activity;
import android.app.Application;
import android.support.v4.app.Fragment;

import com.binatika.deteksigolongandarah.model.GejalaPenyakitModel;
import com.binatika.deteksigolongandarah.model.GolonganDarahModel;
import com.binatika.deteksigolongandarah.model.HasilPenyakitModel;
import com.binatika.deteksigolongandarah.model.PenyakitModel;
import com.binatika.deteksigolongandarah.model.UserModel;

import io.realm.Realm;
import io.realm.RealmResults;


public class RealmController {

    private static RealmController instance;
    private final Realm realm;

    public RealmController(Application application) {
        realm = Realm.getDefaultInstance();
    }

    public static RealmController with(Fragment fragment) {

        if (instance == null) {
            instance = new RealmController(fragment.getActivity().getApplication());
        }
        return instance;
    }

    public static RealmController with(Activity activity) {

        if (instance == null) {
            instance = new RealmController(activity.getApplication());
        }
        return instance;
    }

    public static RealmController with(Application application) {

        if (instance == null) {
            instance = new RealmController(application);
        }
        return instance;
    }

    public static RealmController getInstance() {

        return instance;
    }

    public Realm getRealm() {

        return realm;
    }

    public void refresh() {

        realm.refresh();
    }

    public void clearUser() {

        realm.beginTransaction();
        realm.clear(UserModel.class);
        realm.commitTransaction();
    }

    public void clearGejala() {

        realm.beginTransaction();
        realm.clear(GejalaPenyakitModel.class);
        realm.commitTransaction();
    }

    public void clearPenyakit() {

        realm.beginTransaction();
        realm.clear(PenyakitModel.class);
        realm.commitTransaction();
    }

    public void clearGolonganDarah() {

        realm.beginTransaction();
        realm.clear(GolonganDarahModel.class);
        realm.commitTransaction();
    }

    public void clearHasilPenyakit() {

        realm.beginTransaction();
        realm.clear(HasilPenyakitModel.class);
        realm.commitTransaction();
    }

    public boolean hasGejalaPenyakit() {

        return !realm.allObjects(GejalaPenyakitModel.class).isEmpty();
    }

    public RealmResults<GejalaPenyakitModel> getAllGejala() {

        return realm.where(GejalaPenyakitModel.class).findAll();
    }

    public RealmResults<PenyakitModel> getAllPenyakit() {
        RealmResults<PenyakitModel> result = realm.where(PenyakitModel.class).findAll();
        result.sort("id", RealmResults.SORT_ORDER_ASCENDING);
        return result;
    }

    public RealmResults<GolonganDarahModel> getAllGolonganDarah() {

        return realm.where(GolonganDarahModel.class).findAll();
    }

    public RealmResults<HasilPenyakitModel> getAllHasil() {

        return realm.where(HasilPenyakitModel.class).findAll();
    }

    public UserModel getUser(String username, String password) {
        return realm.where(UserModel.class)
                .equalTo("username", username)
                .equalTo("password", password)
                .findFirst();
    }

    public GejalaPenyakitModel getGejala(String kode_gejala) {

        return realm.where(GejalaPenyakitModel.class).equalTo("kode_gejala", kode_gejala).findFirst();
    }

    public PenyakitModel getPenyakit(String kode_penyakit) {

        return realm.where(PenyakitModel.class).equalTo("kode_penyakit", kode_penyakit).findFirst();
    }

    public GolonganDarahModel getGolonganDarah(String golongan_darah) {

        return realm.where(GolonganDarahModel.class).equalTo("golongan_darah", golongan_darah).findFirst();
    }

    public HasilPenyakitModel getHasil(String golongan_darah) {

        return realm.where(HasilPenyakitModel.class).equalTo("golongan_darah", golongan_darah).findFirst();
    }

    public RealmResults<HasilPenyakitModel> getKodeGejala(String golongan_darah) {

        return realm.where(HasilPenyakitModel.class)
                .equalTo("golongan_darah", golongan_darah)
                .findAll();

    }

    public RealmResults<HasilPenyakitModel> hasilAkhirWithGejala(String golongan_darah, String kode_gejala) {

        return realm.where(HasilPenyakitModel.class)
                .equalTo("kode_gejala", kode_gejala)
                .equalTo("golongan_darah", golongan_darah)
                .findAll();

    }

    public RealmResults<HasilPenyakitModel> hasil(String kode_penyakit, String kode_gejala) {

        return realm.where(HasilPenyakitModel.class)
                .contains("kode_penyakit", kode_penyakit)
                .or()
                .contains("kode_gejala", kode_gejala)
                .findAll();

    }
}
