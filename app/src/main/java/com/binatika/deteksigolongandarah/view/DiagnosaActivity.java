package com.binatika.deteksigolongandarah.view;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ProgressBar;
import android.widget.Spinner;

import com.binatika.deteksigolongandarah.R;
import com.binatika.deteksigolongandarah.adapter.GejalaAdapter1;
import com.binatika.deteksigolongandarah.adapter.GejalaAdapter2;
import com.binatika.deteksigolongandarah.api.APIService;
import com.binatika.deteksigolongandarah.api.ViewDataGejalaResponse;
import com.binatika.deteksigolongandarah.api.BaseResponseGejala;
import com.binatika.deteksigolongandarah.util.Const;
import com.binatika.deteksigolongandarah.view.base.BaseActivity;
import com.binatika.deteksigolongandarah.widget.SingleSpinnerAdapter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;
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

public class DiagnosaActivity extends BaseActivity implements GejalaAdapter1.AdapterListener, GejalaAdapter2.AdapterListener{

    @BindView(R.id.rvQuestion1) RecyclerView rvQuestion1;
    @BindView(R.id.pbQuestion1) ProgressBar pbQuestion1;
    GejalaAdapter1 gejalaAdapter1;

    ArrayList<String> temporary;
    String golonganDarah = "";
    List<ViewDataGejalaResponse> dataP2;
    private Retrofit retrofit;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setLayout(R.layout.activity_diagnosa, this);
        initializeRetrofit();
        initView();

        temporary = new ArrayList<>();

        rvQuestion1.setLayoutManager(new LinearLayoutManager(this));
        rvQuestion1.setNestedScrollingEnabled(false);
        rvQuestion1.setHasFixedSize(false);
        rvQuestion1.setAdapter(gejalaAdapter1 = new GejalaAdapter1());

    }

    public void initView(){
        Log.e("type", getIntent().getStringExtra("type"));
        golonganDarah = getIntent().getStringExtra("type");
        getData(golonganDarah);

    }

    @OnClick(R.id.btnLanjut)
    public void btnLanjut(){
        Bundle bundle = new Bundle();
        bundle.putSerializable("data", (Serializable) dataP2);
        Intent intent = new Intent(DiagnosaActivity.this, DiagnosaActivity2.class);
        intent.putStringArrayListExtra("temporary1", temporary);
        intent.putExtra("golonganDarah", golonganDarah);
        intent.putExtras(bundle);
        startActivity(intent);
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

    private void getData(String golonganDarah){

        HashMap<String, String> params = new HashMap<>();
        params.put("golongan_darah", golonganDarah);

        APIService apiService = retrofit.create(APIService.class);
        Call<BaseResponseGejala> result = apiService.postGejala(params);
        result.enqueue(new Callback<BaseResponseGejala>() {
            @Override
            public void onResponse(Call<BaseResponseGejala> call, Response<BaseResponseGejala> response) {
                pbQuestion1.setVisibility(View.GONE);
                try {
                    if(response.body()!=null){
                        List<ViewDataGejalaResponse> dataP1 = new ArrayList<>();
                        dataP2 = new ArrayList<>();
                        for (int i = 0; i < response.body().getData().size(); i++) {
                            if (response.body().getData().get(i).getKodePertanyaan().equals("P1")){
                                dataP1.add(response.body().getData().get(i));
                            } else {
                                dataP2.add(response.body().getData().get(i));
                            }
                        }
                        gejalaAdapter1.updateList(dataP1);
                        gejalaAdapter1.setAdapterListener(DiagnosaActivity.this);
                        Log.e("data size", ""+dataP2.size());
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<BaseResponseGejala> call, Throwable t) {
                pbQuestion1.setVisibility(View.GONE);
                t.printStackTrace();
            }
        });
    }

    @Override
    public void onClick(ViewDataGejalaResponse model) {
        if (!model.isChecked()){
            for (int i = 0; i < temporary.size(); i++) {
                if (temporary.get(i).equals(model.getKodeGejala())) {
                    temporary.remove(i);
                }
            }
        } else {
            temporary.add(model.getKodeGejala());
        }
    }
}
