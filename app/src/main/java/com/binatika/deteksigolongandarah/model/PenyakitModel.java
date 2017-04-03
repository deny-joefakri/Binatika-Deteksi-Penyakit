package com.binatika.deteksigolongandarah.model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by dev_deny on 3/26/17.
 */

public class PenyakitModel extends RealmObject {

    private long id;
    @PrimaryKey
    private String kode_penyakit;
    private String nama_penyakit;
    private String penyebab;
    private String pengobatan;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getKode_penyakit() {
        return kode_penyakit;
    }

    public void setKode_penyakit(String kode_penyakit) {
        this.kode_penyakit = kode_penyakit;
    }

    public String getNama_penyakit() {
        return nama_penyakit;
    }

    public void setNama_penyakit(String nama_penyakit) {
        this.nama_penyakit = nama_penyakit;
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
