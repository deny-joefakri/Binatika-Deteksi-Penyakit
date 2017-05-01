package com.binatika.deteksigolongandarah.view;

import android.content.Intent;
import android.os.Bundle;
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

    @BindView(R.id.spnGolonganDarah) Spinner spnGolonganDarah;
    @BindView(R.id.rvQuestion1) RecyclerView rvQuestion1;
    @BindView(R.id.rvQuestion2) RecyclerView rvQuestion2;
    @BindView(R.id.pbQuestion1) ProgressBar pbQuestion1;
    @BindView(R.id.pbQuestion2) ProgressBar pbQuestion2;
    GejalaAdapter1 gejalaAdapter1;
    GejalaAdapter2 gejalaAdapter2;

    ArrayList<String> temporary;
    String golonganDarah = "";
    private Retrofit retrofit;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setLayout(R.layout.activity_diagnosa, this);
        initView();
        initializeRetrofit();

        temporary = new ArrayList<>();

        rvQuestion1.setLayoutManager(new LinearLayoutManager(this));
        rvQuestion1.setNestedScrollingEnabled(false);
        rvQuestion1.setHasFixedSize(false);
        rvQuestion1.setAdapter(gejalaAdapter1 = new GejalaAdapter1());

        rvQuestion2.setLayoutManager(new LinearLayoutManager(this));
        rvQuestion2.setNestedScrollingEnabled(false);
        rvQuestion2.setHasFixedSize(false);
        rvQuestion2.setAdapter(gejalaAdapter2 = new GejalaAdapter2());

    }

    public void initView(){
        final ArrayList<String> golongan_darah = new ArrayList<>();
        golongan_darah.add("A");
        golongan_darah.add("B");
        golongan_darah.add("O");
        golongan_darah.add("AB");

        spnGolonganDarah.setAdapter(new SingleSpinnerAdapter(this, getLayoutInflater(), golongan_darah));

        spnGolonganDarah.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                golonganDarah = golongan_darah.get(position);
                //initDataGejala();
                getData(golonganDarah);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    @OnClick(R.id.btnLanjut)
    public void btnLanjut(){
        Intent intent = new Intent(DiagnosaActivity.this, ResultPenyakit.class);
        intent.putStringArrayListExtra("data", temporary);
        intent.putExtra("golonganDarah", golonganDarah);
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
                pbQuestion2.setVisibility(View.GONE);
                try {
                    if(response.body()!=null){
                        List<ViewDataGejalaResponse> dataP1 = new ArrayList<>();
                        List<ViewDataGejalaResponse> dataP2 = new ArrayList<>();
                        for (int i = 0; i < response.body().getData().size(); i++) {
                            if (response.body().getData().get(i).getKodePertanyaan().equals("P1")){
                                dataP1.add(response.body().getData().get(i));
                            } else {
                                dataP2.add(response.body().getData().get(i));
                            }
                        }
                        gejalaAdapter1.updateList(dataP1);
                        gejalaAdapter1.setAdapterListener(DiagnosaActivity.this);
                        gejalaAdapter2.updateList(dataP2);
                        gejalaAdapter2.setAdapterListener(DiagnosaActivity.this);
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<BaseResponseGejala> call, Throwable t) {
                pbQuestion1.setVisibility(View.GONE);
                pbQuestion2.setVisibility(View.GONE);
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
