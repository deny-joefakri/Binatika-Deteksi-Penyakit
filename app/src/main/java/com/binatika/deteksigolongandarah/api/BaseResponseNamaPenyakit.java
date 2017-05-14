package com.binatika.deteksigolongandarah.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by dev_deny on 5/1/17.
 */

public class BaseResponseNamaPenyakit {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("data")
    @Expose
    private ViewPenyakit data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ViewPenyakit getData() {
        return data;
    }

    public void setData(ViewPenyakit data) {
        this.data = data;
    }
}
