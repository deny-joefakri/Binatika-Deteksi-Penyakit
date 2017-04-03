package com.binatika.deteksigolongandarah.model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by dev_deny on 3/26/17.
 */

public class GolonganDarahModel extends RealmObject {

    @PrimaryKey
    private String golongan_darah;
    private String pengobatan;

    public String getGolongan_darah() {
        return golongan_darah;
    }

    public void setGolongan_darah(String golongan_darah) {
        this.golongan_darah = golongan_darah;
    }

    public String getPengobatan() {
        return pengobatan;
    }

    public void setPengobatan(String pengobatan) {
        this.pengobatan = pengobatan;
    }
}
