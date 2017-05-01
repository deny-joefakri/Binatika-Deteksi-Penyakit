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
import com.binatika.deteksigolongandarah.adapter.GejalaAdapter;
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
import io.realm.Realm;
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

public class DiagnosaActivity extends BaseActivity implements GejalaAdapter.AdapterListener{

    @BindView(R.id.spnGolonganDarah) Spinner spnGolonganDarah;
    @BindView(R.id.rvAnswer) RecyclerView rvAnswer;
    @BindView(R.id.rvGejala) RecyclerView rvGejala;
    @BindView(R.id.pbGejala) ProgressBar pbGejala;
    GejalaAdapter gejalaAdapter;

    Realm realm;
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
        /*realm = RealmController.with(this).getRealm();
        RealmController.with(this).refresh();*/

        rvGejala.setLayoutManager(new LinearLayoutManager(this));
        rvGejala.setNestedScrollingEnabled(false);
        rvGejala.setHasFixedSize(false);
        rvGejala.setAdapter(gejalaAdapter = new GejalaAdapter());
        //initDataGejala();


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

    /*public void initDataGejala(){

        RealmResults<HasilPenyakitModel> getKodeGejala = RealmController.with(this).getKodeGejala(golonganDarah);
        ArrayList<Model> data = new ArrayList<>();
        for (int i = 0; i < getKodeGejala.size(); i++) {
            GejalaPenyakitModel getGejala = RealmController.with(this).getGejala(getKodeGejala.get(i).getKode_gejala());
            Model model = new Model();
            model.setTitle(getGejala.getGejala());
            model.setKode(getGejala.getKode_gejala());
            data.add(model);
        }

        gejalaAdapter.updateList(data);
        gejalaAdapter.setAdapterListener(this);

    }*/

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
                pbGejala.setVisibility(View.GONE);
                try {
                    if(response.body()!=null){
                        List<ViewDataGejalaResponse> data = response.body().getData();
                        Log.e("response", ""+response.body().getStatus());
                        gejalaAdapter.updateList(data);
                        gejalaAdapter.setAdapterListener(DiagnosaActivity.this);
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<BaseResponseGejala> call, Throwable t) {
                pbGejala.setVisibility(View.GONE);
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
