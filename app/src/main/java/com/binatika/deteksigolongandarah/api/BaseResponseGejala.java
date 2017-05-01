package com.binatika.deteksigolongandarah.api;

/**
 * Created by dev_deny on 5/1/17.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BaseResponseGejala {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("data")
    @Expose
    private List<ViewDataGejalaResponse> data = null;

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

    public List<ViewDataGejalaResponse> getData() {
        return data;
    }

    public void setData(List<ViewDataGejalaResponse> data) {
        this.data = data;
    }


}


