package com.binatika.deteksigolongandarah.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by dev_deny on 5/1/17.
 */

public class ViewDataGejalaResponse {

    @SerializedName("gejala")
    @Expose
    private String gejala;
    @SerializedName("kode_gejala")
    @Expose
    private String kodeGejala;
    @SerializedName("golongan_darah")
    @Expose
    private String golonganDarah;
    @SerializedName("kode_penyakit")
    @Expose
    private String kodePenyakit;

    private boolean checked;

    public String getGejala() {
        return gejala;
    }

    public void setGejala(String gejala) {
        this.gejala = gejala;
    }

    public String getKodeGejala() {
        return kodeGejala;
    }

    public void setKodeGejala(String kodeGejala) {
        this.kodeGejala = kodeGejala;
    }

    public String getGolonganDarah() {
        return golonganDarah;
    }

    public void setGolonganDarah(String golonganDarah) {
        this.golonganDarah = golonganDarah;
    }

    public String getKodePenyakit() {
        return kodePenyakit;
    }

    public void setKodePenyakit(String kodePenyakit) {
        this.kodePenyakit = kodePenyakit;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

}
