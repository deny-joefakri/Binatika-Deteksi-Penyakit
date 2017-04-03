package com.binatika.deteksigolongandarah.realm;

import android.app.Activity;

import com.binatika.deteksigolongandarah.model.GolonganDarahModel;

import java.util.ArrayList;

/**
 * Created by dev_deny on 3/26/17.
 */

public class DataGolonganDarah {

    public static ArrayList<GolonganDarahModel> getGolonganModels(Activity activity){
        RealmController.with(activity).clearGolonganDarah();
        ArrayList<GolonganDarahModel> golonganDarahModels = new ArrayList<>();

        GolonganDarahModel golonganDarahModel = new GolonganDarahModel();
        golonganDarahModel.setGolongan_darah("A");
        golonganDarahModel.setPengobatan("Untuk yang bergolongan darah A akan sangat baik jika diberikan protein nabati, seperti makanan berbahan kedelai, serta ditingkatkan aktivitas dan intensitas olahraganya mereka akan merasa lebih segar dan ernergik. Olahraga yang cocok yaitu yoga.");
        golonganDarahModels.add(golonganDarahModel);

        golonganDarahModel = new GolonganDarahModel();
        golonganDarahModel.setGolongan_darah("B");
        golonganDarahModel.setPengobatan("Untuk yang bergolongan darah B perlu mengkombinasikan makanan tinggi protein seperti daging yang diimbangi dengan konsumsi sayuran, biji-bijian (sereal), dan buah-buahan. Jenis olahraga yang cocok adalah seperti hiking, tenis, sepeda santai, aerobic dan berenang.");
        golonganDarahModels.add(golonganDarahModel);

        golonganDarahModel = new GolonganDarahModel();
        golonganDarahModel.setGolongan_darah("AB");
        golonganDarahModel.setPengobatan("Untuk yang bergolongan darah AB dianjurkan mengkonsumsi makanan seperti daging, ikan, susu, tahu, buncis, sereal, sayuran dan buah. Jenisolahraga yang cocok seperti yoga, bersepeda santai, dan tenis.");
        golonganDarahModels.add(golonganDarahModel);

        golonganDarahModel = new GolonganDarahModel();
        golonganDarahModel.setGolongan_darah("O");
        golonganDarahModel.setPengobatan("Untuk yang bergolongan darah O bertambah baik keadaannya jika diberikan makanan tinggi protein dan akan semakin segar dan energik setelah melakukan olahraga seperti aerobic, lari, beladiri, dan jogging");
        golonganDarahModels.add(golonganDarahModel);

        return golonganDarahModels;
    }
}
