package com.binatika.deteksigolongandarah.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.binatika.deteksigolongandarah.R;
import com.binatika.deteksigolongandarah.api.APIService;
import com.binatika.deteksigolongandarah.api.BaseResponseGejala;
import com.binatika.deteksigolongandarah.api.BaseResponsePenyakit;
import com.binatika.deteksigolongandarah.api.ViewDataGejalaResponse;
import com.binatika.deteksigolongandarah.model.GejalaPenyakitModel;
import com.binatika.deteksigolongandarah.model.HasilPenyakitModel;
import com.binatika.deteksigolongandarah.model.PenyakitModel;
import com.binatika.deteksigolongandarah.realm.RealmController;
import com.binatika.deteksigolongandarah.util.Const;
import com.binatika.deteksigolongandarah.view.base.BaseActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import butterknife.BindView;
import io.realm.Realm;
import io.realm.RealmResults;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by dev_deny on 3/26/17.
 */

public class ResultPenyakit extends BaseActivity {

    @BindView(R.id.resultPenyakit) TextView resultPenyakit;
    Realm realm;
    private Retrofit retrofit;
    ArrayList<String> dataReceiver;
    ArrayList<String> resultData;
    String temporaryValue = "";
    int i = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setLayout(R.layout.activity_hasil, this);
        resultData = new ArrayList<>();

        /*realm = RealmController.with(this).getRealm();
        RealmController.with(this).refresh();*/

        initializeRetrofit();
        result();
    }

    public void result(){
        dataReceiver = getIntent().getStringArrayListExtra("data");
        String golongan_darah = getIntent().getStringExtra("golonganDarah");

        for (int i = 0; i < dataReceiver.size(); i++) {
            getData(golongan_darah, dataReceiver.get(i));
        }

        /*String temporaryValue = "";
        ArrayList<String> resultData = new ArrayList<>();
        for (int i = 0; i < dataReceiver.size(); i++) {
            Log.e("receiver", dataReceiver.get(i));
            RealmResults<HasilPenyakitModel> getData = RealmController.with(this).hasilAkhirWithGejala(golongan_darah, dataReceiver.get(i));
            for (int j = 0; j < getData.size(); j++) {
                if (!getData.get(j).getKode_penyakit().equals(temporaryValue)){
                    temporaryValue = getData.get(j).getKode_penyakit();
                    PenyakitModel getPenyakit = RealmController.with(this).getPenyakit(getData.get(j).getKode_penyakit());
                    resultData.add(getPenyakit.getNama_penyakit());
                    Log.e("kode penyakit", getData.get(j).getKode_penyakit());
                    Log.e("nama penyakit", getPenyakit.getNama_penyakit());
                }
            }
        }

        for (int i = 0; i < resultData.size(); i++) {
            if (resultData.size() == 1) {
                resultPenyakit.setText(resultData.get(0));
            } else if (resultData.size() == 2) {
                resultPenyakit.setText(resultData.get(0) + resultData.get(1));
            } else if (resultData.size() == 3) {
                resultPenyakit.setText(resultData.get(0) + resultData.get(1) + resultData.get(2));
            } else {
                resultPenyakit.setText(resultData.get(0) + resultData.get(1) + resultData.get(2) + resultData.get(3));
            }
        }*/

    }

    private void initializeRetrofit(){
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

        retrofit = new Retrofit.Builder()
                .baseUrl(Const.BASE_API)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    private void getData(String golonganDarah, String kode_gejala){


        HashMap<String, String> params = new HashMap<>();
        params.put("golongan_darah", golonganDarah);
        params.put("kode_gejala", kode_gejala);

        final APIService apiService = retrofit.create(APIService.class);
        final Call<BaseResponsePenyakit> result = apiService.postPenyakit(params);
        result.enqueue(new Callback<BaseResponsePenyakit>() {
            @Override
            public void onResponse(Call<BaseResponsePenyakit> call, Response<BaseResponsePenyakit> response) {
                i++;
                try {
                    if(response.body()!=null){
                        /*resultData.add(response.body().getData().getNamaPenyakit());
                        Log.e("data penyakit", response.body().getData().getNamaPenyakit());*/

                        resultData.add(response.body().getData().getNamaPenyakit());

                        /*if (resultData.size() == 0){
                            resultData.add(response.body().getData().getNamaPenyakit());
                        } else {
                            for (int j = 0; j < resultData.size(); j++) {
                                if (!resultData.get(j).equals(response.body().getData().getNamaPenyakit())){
                                    resultData.add(response.body().getData().getNamaPenyakit());
                                }
                            }
                        }*/

                        /*if (!response.body().getData().getKodePenyakit().equals(temporaryValue)){
                            temporaryValue = response.body().getData().getKodePenyakit();
                        }*/

                        if (i == dataReceiver.size()){
                            resultPenyakit.setText(merge(resultData));
                            Log.e("real data", merge2(resultData));
                        }
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<BaseResponsePenyakit> call, Throwable t) {
                t.printStackTrace();
            }
        });


        /*for (int i = 0; i < resultData.size(); i++) {
            if (resultData.size() == 1) {
                resultPenyakit.setText(resultData.get(0));
            } else if (resultData.size() == 2) {
                resultPenyakit.setText(resultData.get(0) + resultData.get(1));
            } else if (resultData.size() == 3) {
                resultPenyakit.setText(resultData.get(0) + resultData.get(1) + resultData.get(2));
            } else {
                resultPenyakit.setText(resultData.get(0) + resultData.get(1) + resultData.get(2) + resultData.get(3));
            }
        }*/
    }

    public static String merge(ArrayList<String> result){
        String data = "";
        if (result.size() == 1){
            data = result.get(0);
        }else {
            for (int i = 0; i < result.size(); i++) {
                if (i == 0) {
                    if (!data.contains(result.get(i)+",")) {
                        data = result.get(i) + ", ";
                    }
                } else if (i == (result.size() - 1)) {
                    if (!data.contains(result.get(i)+","))
                        data = data + result.get(i);
                } else {
                    if (!data.contains(result.get(i)+","))
                        data = data + result.get(i)+ ", ";
                }
            }
        }
        return data;
    }

    public static String merge2(ArrayList<String> result){
        String data = "";
        if (result.size() == 1){
            data = result.get(0);
        }else {
            for (int i = 0; i < result.size(); i++) {
                if (i == 0) {
                    data = result.get(i) + ", ";
                } else if (i == (result.size() - 1)) {
                    data = data + result.get(i);
                } else {
                    data = data + result.get(i)+ ", ";
                }
            }
        }
        return data;
    }

}
