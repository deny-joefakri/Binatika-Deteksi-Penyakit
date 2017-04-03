package com.binatika.deteksigolongandarah.realm;

import android.app.Activity;

import com.binatika.deteksigolongandarah.model.HasilPenyakitModel;

import java.util.ArrayList;

/**
 * Created by dev_deny on 3/26/17.
 */

public class DataHasil {

    public static ArrayList<HasilPenyakitModel> getHasil(Activity activity){
        RealmController.with(activity).clearHasilPenyakit();
        ArrayList<HasilPenyakitModel> hasilPenyakitModels = new ArrayList<>();

        HasilPenyakitModel hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("A");
        hasilPenyakitModel.setKode_penyakit("P1");
        hasilPenyakitModel.setKode_gejala("G23");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("A");
        hasilPenyakitModel.setKode_penyakit("P1");
        hasilPenyakitModel.setKode_gejala("G24");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("A");
        hasilPenyakitModel.setKode_penyakit("P1");
        hasilPenyakitModel.setKode_gejala("G27");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("A");
        hasilPenyakitModel.setKode_penyakit("P1");
        hasilPenyakitModel.setKode_gejala("G29");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("A");
        hasilPenyakitModel.setKode_penyakit("P2");
        hasilPenyakitModel.setKode_gejala("G39");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("A");
        hasilPenyakitModel.setKode_penyakit("P2");
        hasilPenyakitModel.setKode_gejala("G28");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("A");
        hasilPenyakitModel.setKode_penyakit("P2");
        hasilPenyakitModel.setKode_gejala("G30");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("A");
        hasilPenyakitModel.setKode_penyakit("P2");
        hasilPenyakitModel.setKode_gejala("G31");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("A");
        hasilPenyakitModel.setKode_penyakit("P2");
        hasilPenyakitModel.setKode_gejala("G37");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("A");
        hasilPenyakitModel.setKode_penyakit("P2");
        hasilPenyakitModel.setKode_gejala("G50");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("A");
        hasilPenyakitModel.setKode_penyakit("P3");
        hasilPenyakitModel.setKode_gejala("G26");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("A");
        hasilPenyakitModel.setKode_penyakit("P3");
        hasilPenyakitModel.setKode_gejala("G33");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("A");
        hasilPenyakitModel.setKode_penyakit("P3");
        hasilPenyakitModel.setKode_gejala("G32");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("A");
        hasilPenyakitModel.setKode_penyakit("P3");
        hasilPenyakitModel.setKode_gejala("G34");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("A");
        hasilPenyakitModel.setKode_penyakit("P3");
        hasilPenyakitModel.setKode_gejala("G36");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("A");
        hasilPenyakitModel.setKode_penyakit("P3");
        hasilPenyakitModel.setKode_gejala("G40");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("A");
        hasilPenyakitModel.setKode_penyakit("P3");
        hasilPenyakitModel.setKode_gejala("G41");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("A");
        hasilPenyakitModel.setKode_penyakit("P4");
        hasilPenyakitModel.setKode_gejala("G38");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("A");
        hasilPenyakitModel.setKode_penyakit("P4");
        hasilPenyakitModel.setKode_gejala("G42");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("A");
        hasilPenyakitModel.setKode_penyakit("P4");
        hasilPenyakitModel.setKode_gejala("G46");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("A");
        hasilPenyakitModel.setKode_penyakit("P4");
        hasilPenyakitModel.setKode_gejala("G48");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("A");
        hasilPenyakitModel.setKode_penyakit("P4");
        hasilPenyakitModel.setKode_gejala("G49");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("A");
        hasilPenyakitModel.setKode_penyakit("P4");
        hasilPenyakitModel.setKode_gejala("G53");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("B");
        hasilPenyakitModel.setKode_penyakit("P2");
        hasilPenyakitModel.setKode_gejala("G39");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("B");
        hasilPenyakitModel.setKode_penyakit("P2");
        hasilPenyakitModel.setKode_gejala("G28");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("B");
        hasilPenyakitModel.setKode_penyakit("P2");
        hasilPenyakitModel.setKode_gejala("G30");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("B");
        hasilPenyakitModel.setKode_penyakit("P2");
        hasilPenyakitModel.setKode_gejala("G31");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("B");
        hasilPenyakitModel.setKode_penyakit("P2");
        hasilPenyakitModel.setKode_gejala("G37");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("B");
        hasilPenyakitModel.setKode_penyakit("P2");
        hasilPenyakitModel.setKode_gejala("G50");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("B");
        hasilPenyakitModel.setKode_penyakit("P6");
        hasilPenyakitModel.setKode_gejala("G43");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("B");
        hasilPenyakitModel.setKode_penyakit("P6");
        hasilPenyakitModel.setKode_gejala("G45");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("B");
        hasilPenyakitModel.setKode_penyakit("P6");
        hasilPenyakitModel.setKode_gejala("G52");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("B");
        hasilPenyakitModel.setKode_penyakit("P6");
        hasilPenyakitModel.setKode_gejala("G51");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("B");
        hasilPenyakitModel.setKode_penyakit("P6");
        hasilPenyakitModel.setKode_gejala("G54");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("B");
        hasilPenyakitModel.setKode_penyakit("P6");
        hasilPenyakitModel.setKode_gejala("G35");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("B");
        hasilPenyakitModel.setKode_penyakit("P6");
        hasilPenyakitModel.setKode_gejala("G55");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("B");
        hasilPenyakitModel.setKode_penyakit("P7");
        hasilPenyakitModel.setKode_gejala("G44");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("B");
        hasilPenyakitModel.setKode_penyakit("P7");
        hasilPenyakitModel.setKode_gejala("G18");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("B");
        hasilPenyakitModel.setKode_penyakit("P7");
        hasilPenyakitModel.setKode_gejala("G47");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("B");
        hasilPenyakitModel.setKode_penyakit("P7");
        hasilPenyakitModel.setKode_gejala("G56");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("AB");
        hasilPenyakitModel.setKode_penyakit("P1");
        hasilPenyakitModel.setKode_gejala("G23");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("AB");
        hasilPenyakitModel.setKode_penyakit("P1");
        hasilPenyakitModel.setKode_gejala("G24");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("AB");
        hasilPenyakitModel.setKode_penyakit("P1");
        hasilPenyakitModel.setKode_gejala("G27");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("AB");
        hasilPenyakitModel.setKode_penyakit("P1");
        hasilPenyakitModel.setKode_gejala("G29");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("AB");
        hasilPenyakitModel.setKode_penyakit("P3");
        hasilPenyakitModel.setKode_gejala("G26");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("AB");
        hasilPenyakitModel.setKode_penyakit("P3");
        hasilPenyakitModel.setKode_gejala("G33");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("AB");
        hasilPenyakitModel.setKode_penyakit("P3");
        hasilPenyakitModel.setKode_gejala("G32");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("AB");
        hasilPenyakitModel.setKode_penyakit("P3");
        hasilPenyakitModel.setKode_gejala("G34");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("AB");
        hasilPenyakitModel.setKode_penyakit("P3");
        hasilPenyakitModel.setKode_gejala("G36");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("AB");
        hasilPenyakitModel.setKode_penyakit("P3");
        hasilPenyakitModel.setKode_gejala("G40");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("AB");
        hasilPenyakitModel.setKode_penyakit("P3");
        hasilPenyakitModel.setKode_gejala("G41");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("O");
        hasilPenyakitModel.setKode_penyakit("P10");
        hasilPenyakitModel.setKode_gejala("G1");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("O");
        hasilPenyakitModel.setKode_penyakit("P10");
        hasilPenyakitModel.setKode_gejala("G2");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("O");
        hasilPenyakitModel.setKode_penyakit("P10");
        hasilPenyakitModel.setKode_gejala("G4");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("O");
        hasilPenyakitModel.setKode_penyakit("P10");
        hasilPenyakitModel.setKode_gejala("G5");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("O");
        hasilPenyakitModel.setKode_penyakit("P10");
        hasilPenyakitModel.setKode_gejala("G11");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("O");
        hasilPenyakitModel.setKode_penyakit("P10");
        hasilPenyakitModel.setKode_gejala("G8");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("O");
        hasilPenyakitModel.setKode_penyakit("P11");
        hasilPenyakitModel.setKode_gejala("G12");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("O");
        hasilPenyakitModel.setKode_penyakit("P11");
        hasilPenyakitModel.setKode_gejala("G13");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("O");
        hasilPenyakitModel.setKode_penyakit("P11");
        hasilPenyakitModel.setKode_gejala("G16");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("O");
        hasilPenyakitModel.setKode_penyakit("P11");
        hasilPenyakitModel.setKode_gejala("G18");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("O");
        hasilPenyakitModel.setKode_penyakit("P11");
        hasilPenyakitModel.setKode_gejala("G17");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("O");
        hasilPenyakitModel.setKode_penyakit("P11");
        hasilPenyakitModel.setKode_gejala("G20");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("O");
        hasilPenyakitModel.setKode_penyakit("P11");
        hasilPenyakitModel.setKode_gejala("G58");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("O");
        hasilPenyakitModel.setKode_penyakit("P12");
        hasilPenyakitModel.setKode_gejala("G10");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("O");
        hasilPenyakitModel.setKode_penyakit("P12");
        hasilPenyakitModel.setKode_gejala("G3");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("O");
        hasilPenyakitModel.setKode_penyakit("P12");
        hasilPenyakitModel.setKode_gejala("G9");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("O");
        hasilPenyakitModel.setKode_penyakit("P12");
        hasilPenyakitModel.setKode_gejala("G7");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("O");
        hasilPenyakitModel.setKode_penyakit("P12");
        hasilPenyakitModel.setKode_gejala("G6");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("O");
        hasilPenyakitModel.setKode_penyakit("P13");
        hasilPenyakitModel.setKode_gejala("G15");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("O");
        hasilPenyakitModel.setKode_penyakit("P13");
        hasilPenyakitModel.setKode_gejala("G14");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("O");
        hasilPenyakitModel.setKode_penyakit("P13");
        hasilPenyakitModel.setKode_gejala("G19");
        hasilPenyakitModels.add(hasilPenyakitModel);

        hasilPenyakitModel = new HasilPenyakitModel();
        hasilPenyakitModel.setGolongan_darah("O");
        hasilPenyakitModel.setKode_penyakit("P13");
        hasilPenyakitModel.setKode_gejala("G22");
        hasilPenyakitModels.add(hasilPenyakitModel);

        return hasilPenyakitModels;
    }
}
