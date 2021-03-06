package com.binatika.deteksigolongandarah.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by dev_deny on 5/1/17.
 */

public class ViewDataPenyakitResponse {

    @SerializedName("kode_penyakit")
    @Expose
    private String kodePenyakit;
    @SerializedName("nama_penyakit")
    @Expose
    private String namaPenyakit;
    @SerializedName("penyebab")
    @Expose
    private String penyebab;
    @SerializedName("pengobatan")
    @Expose
    private String pengobatan;

    public String getKodePenyakit() {
        return kodePenyakit;
    }

    public void setKodePenyakit(String kodePenyakit) {
        this.kodePenyakit = kodePenyakit;
    }

    public String getNamaPenyakit() {
        return namaPenyakit;
    }

    public void setNamaPenyakit(String namaPenyakit) {
        this.namaPenyakit = namaPenyakit;
    }

    public String getPenyebab() {
        return penyebab;
    }

    public void setPenyebab(String penyebab) {
        this.penyebab = penyebab;
    }

    public String getPengobatan() {
        return pengobatan;
    }

    public void setPengobatan(String pengobatan) {
        this.pengobatan = pengobatan;
    }
}
