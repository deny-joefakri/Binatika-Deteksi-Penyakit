package com.binatika.deteksigolongandarah.realm;

import android.app.Activity;

import com.binatika.deteksigolongandarah.model.GejalaPenyakitModel;

import java.util.ArrayList;

/**
 * Created by dev_deny on 3/26/17.
 */

public class DataGejala {

    public static ArrayList<GejalaPenyakitModel> gejalaPenyakitModels (Activity activity){
        RealmController.with(activity).clearGejala();
        ArrayList<GejalaPenyakitModel> gejalaPenyakitModels = new ArrayList<>();

        GejalaPenyakitModel gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G1");
        gejalaPenyakitModel.setGejala("Rasa nyeri di tangan/lutut/pergelangan kaki/jari kaki");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G2");
        gejalaPenyakitModel.setGejala("Pembengkakan");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G3");
        gejalaPenyakitModel.setGejala("Nyeri ulu hati");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G4");
        gejalaPenyakitModel.setGejala("Rasa panas dipersendian");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G5");
        gejalaPenyakitModel.setGejala("Kesemutan");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G6");
        gejalaPenyakitModel.setGejala("Gangguan pencernaan");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G7");
        gejalaPenyakitModel.setGejala("Mual");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G8");
        gejalaPenyakitModel.setGejala("Peradangan yang warnanya kemerahan");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G9");
        gejalaPenyakitModel.setGejala("Tidak nafsu makan");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G10");
        gejalaPenyakitModel.setGejala("Perih atau nyeri pada perut");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G11");
        gejalaPenyakitModel.setGejala("Sulit untuk digerakkan");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G12");
        gejalaPenyakitModel.setGejala("Pembengkakan di bagian leher");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G13");
        gejalaPenyakitModel.setGejala("Mudah lelah");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G14");
        gejalaPenyakitModel.setGejala("Batuk-batuk");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G15");
        gejalaPenyakitModel.setGejala("Bersin-bersin");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G16");
        gejalaPenyakitModel.setGejala("Gangguan berat badan");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G17");
        gejalaPenyakitModel.setGejala("Nyeri sendi");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G18");
        gejalaPenyakitModel.setGejala("Rambut rontok");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G19");
        gejalaPenyakitModel.setGejala("Ruam pada kulit");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G20");
        gejalaPenyakitModel.setGejala("Perubahan emosi");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G21");
        gejalaPenyakitModel.setGejala("Sesak napas");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G22");
        gejalaPenyakitModel.setGejala("Gatal dan merah pada mata");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G23");
        gejalaPenyakitModel.setGejala("Nyeri dada");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G24");
        gejalaPenyakitModel.setGejala("Sesak napas");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G25");
        gejalaPenyakitModel.setGejala("Kelelahan  yang berlebihan");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G26");
        gejalaPenyakitModel.setGejala("Rasa nyeri yang tidak biasa");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G27");
        gejalaPenyakitModel.setGejala("Detak jantung berdebar-debar");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G28");
        gejalaPenyakitModel.setGejala("Peningkatan buang air kecil");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G29");
        gejalaPenyakitModel.setGejala("Pingsan");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G30");
        gejalaPenyakitModel.setGejala("Sering haus dan lapar");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G31");
        gejalaPenyakitModel.setGejala("Mulut terasa kering");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G32");
        gejalaPenyakitModel.setGejala("Demam");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G33");
        gejalaPenyakitModel.setGejala("Penurunan berat badan drastis");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G34");
        gejalaPenyakitModel.setGejala("Batuk tak kunjung sembuh");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G35");
        gejalaPenyakitModel.setGejala("Perubahan penglihatan");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G36");
        gejalaPenyakitModel.setGejala("Sulit menelan");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G37");
        gejalaPenyakitModel.setGejala("Perasaan kebingungan");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G38");
        gejalaPenyakitModel.setGejala("Perasaan tidak enak badan secara keseluruhan");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G39");
        gejalaPenyakitModel.setGejala("Kelelahan");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G40");
        gejalaPenyakitModel.setGejala("Perubahan pada kulit");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G41");
        gejalaPenyakitModel.setGejala("Terjadi pendarahan ditempat yang tidak seharusnya");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G42");
        gejalaPenyakitModel.setGejala("Meriang");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G43");
        gejalaPenyakitModel.setGejala("Bermasalah pada konsentrasi dan ingatan");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G44");
        gejalaPenyakitModel.setGejala("Rasa lelah berkepanjangan");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G45");
        gejalaPenyakitModel.setGejala("Sulit tidur");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G46");
        gejalaPenyakitModel.setGejala("Hilang nafsu makan");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G47");
        gejalaPenyakitModel.setGejala("Pegal-pegal otot");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G48");
        gejalaPenyakitModel.setGejala("Mual dan muntah");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G49");
        gejalaPenyakitModel.setGejala("Diare");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G50");
        gejalaPenyakitModel.setGejala("Rentan terhadap infeksi tertentu");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G51");
        gejalaPenyakitModel.setGejala("Sakit tenggorokan");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G52");
        gejalaPenyakitModel.setGejala("Sakit kepala");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G53");
        gejalaPenyakitModel.setGejala("Rasa sakit di perut");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G54");
        gejalaPenyakitModel.setGejala("Demam ringan");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G55");
        gejalaPenyakitModel.setGejala("Nyeri otot, sendi dan tulang");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G56");
        gejalaPenyakitModel.setGejala("Ruam merah di wajah berbentuk kupu-kupu");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G57");
        gejalaPenyakitModel.setGejala("Lemas");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        gejalaPenyakitModel = new GejalaPenyakitModel();
        gejalaPenyakitModel.setKode_gejala("G58");
        gejalaPenyakitModel.setGejala("Siklus menstruasi terganggu");
        gejalaPenyakitModels.add(gejalaPenyakitModel);

        return gejalaPenyakitModels;
    }

}
