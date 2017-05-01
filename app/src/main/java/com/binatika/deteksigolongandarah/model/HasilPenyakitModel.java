package com.binatika.deteksigolongandarah.model;

/**
 * Created by dev_deny on 3/26/17.
 */

public class HasilPenyakitModel {

    private String golongan_darah;
    private String kode_penyakit;
    private String kode_gejala;

    public String getGolongan_darah() {
        return golongan_darah;
    }

    public void setGolongan_darah(String golongan_darah) {
        this.golongan_darah = golongan_darah;
    }

    public String getKode_penyakit() {
        return kode_penyakit;
    }

    public void setKode_penyakit(String kode_penyakit) {
        this.kode_penyakit = kode_penyakit;
    }

    public String getKode_gejala() {
        return kode_gejala;
    }

    public void setKode_gejala(String kode_gejala) {
        this.kode_gejala = kode_gejala;
    }

}
