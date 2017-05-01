package com.binatika.deteksigolongandarah.api;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by Hafizh Herdi on 10/15/2016.
 */

public interface APIService {

    @FormUrlEncoded
    @POST("view_gejala")
    Call<BaseResponseGejala> postGejala(@FieldMap HashMap<String, String> params);

    @FormUrlEncoded
    @POST("view_penyakit")
    Call<BaseResponsePenyakit> postPenyakit(@FieldMap HashMap<String, String> params);

}
