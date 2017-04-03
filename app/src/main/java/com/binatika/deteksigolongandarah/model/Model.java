package com.binatika.deteksigolongandarah.model;

/**
 * Created by dev_deny on 3/26/17.
 */

public class Model {

    private String kode;
    private String title;
    private boolean checked;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}
