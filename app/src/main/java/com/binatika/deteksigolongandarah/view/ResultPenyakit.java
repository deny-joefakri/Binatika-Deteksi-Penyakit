package com.binatika.deteksigolongandarah.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;

import com.binatika.deteksigolongandarah.R;
import com.binatika.deteksigolongandarah.adapter.GejalaAdapter1;
import com.binatika.deteksigolongandarah.adapter.PenyebabAdapter;
import com.binatika.deteksigolongandarah.api.APIService;
import com.binatika.deteksigolongandarah.api.BaseResponseNamaPenyakit;
import com.binatika.deteksigolongandarah.api.BaseResponsePenyakit;
import com.binatika.deteksigolongandarah.model.TextModel;
import com.binatika.deteksigolongandarah.util.Const;
import com.binatika.deteksigolongandarah.view.base.BaseActivity;

import java.util.ArrayList;
import java.util.HashMap;

import butterknife.BindView;
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

    @BindView(R.id.resultPenyakit) TextView txtPenyakit;
    @BindView(R.id.rvPenyebab) RecyclerView rvPenyebab;
    @BindView(R.id.rvPengobatan) RecyclerView rvPengobatan;
    PenyebabAdapter penyebabAdapter1;
    PenyebabAdapter penyebabAdapter2;

    private Retrofit retrofit;
    ArrayList<String> dataReceiver;
    ArrayList<String> resultPenyakit;
    ArrayList<TextModel> resultPenyebab;
    ArrayList<TextModel> resultPengobatan;
    int penyakitTotal = 0 ;
    int i = 0;
    int j = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setLayout(R.layout.activity_hasil, this);
        resultPenyakit = new ArrayList<>();
        resultPenyebab = new ArrayList<>();
        resultPengobatan = new ArrayList<>();

        rvPenyebab.setLayoutManager(new LinearLayoutManager(this));
        rvPenyebab.setNestedScrollingEnabled(false);
        rvPenyebab.setHasFixedSize(false);
        rvPenyebab.setAdapter(penyebabAdapter1 = new PenyebabAdapter());

        rvPengobatan.setLayoutManager(new LinearLayoutManager(this));
        rvPengobatan.setNestedScrollingEnabled(false);
        rvPengobatan.setHasFixedSize(false);
        rvPengobatan.setAdapter(penyebabAdapter2 = new PenyebabAdapter());

        initializeRetrofit();
        result();
    }

    public void result(){
        dataReceiver = getIntent().getStringArrayListExtra("data");
        String golongan_darah = getIntent().getStringExtra("golonganDarah");

        for (int i = 0; i < dataReceiver.size(); i++) {
            getData(golongan_darah, dataReceiver.get(i));
        }

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

                        resultPenyakit.add(response.body().getData().getNamaPenyakit());

                        if (i == dataReceiver.size()){
                            txtPenyakit.setText(merge(resultPenyakit));

                            String[] penyakit = txtPenyakit.getText().toString().split(", ");
                            penyakitTotal = penyakit.length;
                            for (int j = 0; j < penyakit.length; j++) {
                                getDataLanjutan(penyakit[j]);
                            }

                            Log.e("real data", merge2(resultPenyakit));
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

    }

    private void getDataLanjutan(String nama_penyakit){
        HashMap<String, String> params = new HashMap<>();
        params.put("nama_penyakit", nama_penyakit);

        final APIService apiService = retrofit.create(APIService.class);
        final Call<BaseResponseNamaPenyakit> result = apiService.postPenyakit2(params);
        result.enqueue(new Callback<BaseResponseNamaPenyakit>() {
            @Override
            public void onResponse(Call<BaseResponseNamaPenyakit> call, Response<BaseResponseNamaPenyakit> response) {
                j++;
                try {
                    if(response.body()!=null){

                        TextModel textModel1 = new TextModel();
                        textModel1.setText(response.body().getData().getPenyebab());
                        resultPenyebab.add(textModel1);

                        TextModel textModel2 = new TextModel();
                        textModel2.setText(response.body().getData().getPengobatan());
                        resultPengobatan.add(textModel2);

                        if (j == penyakitTotal){
                            penyebabAdapter1.updateList(resultPenyebab);
                            penyebabAdapter2.updateList(resultPengobatan);
                        }
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<BaseResponseNamaPenyakit> call, Throwable t) {
                t.printStackTrace();
            }
        });

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
        if (data.substring(data.length() - 2).contains(","))
            data = data.substring(0, data.length() - 2);
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
