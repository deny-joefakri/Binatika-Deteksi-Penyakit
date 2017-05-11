package com.binatika.deteksigolongandarah.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;

import com.binatika.deteksigolongandarah.R;
import com.binatika.deteksigolongandarah.adapter.GejalaAdapter1;
import com.binatika.deteksigolongandarah.adapter.GejalaAdapter2;
import com.binatika.deteksigolongandarah.api.APIService;
import com.binatika.deteksigolongandarah.api.BaseResponseGejala;
import com.binatika.deteksigolongandarah.api.ViewDataGejalaResponse;
import com.binatika.deteksigolongandarah.util.Const;
import com.binatika.deteksigolongandarah.view.base.BaseActivity;

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

public class DiagnosaActivity2 extends BaseActivity implements GejalaAdapter2.AdapterListener{

    @BindView(R.id.rvQuestion2) RecyclerView rvQuestion2;
    @BindView(R.id.pbQuestion2) ProgressBar pbQuestion2;
    GejalaAdapter2 gejalaAdapter2;

    ArrayList<String> temporary;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setLayout(R.layout.activity_diagnosa2, this);

        temporary = new ArrayList<>();

        rvQuestion2.setLayoutManager(new LinearLayoutManager(this));
        rvQuestion2.setNestedScrollingEnabled(false);
        rvQuestion2.setHasFixedSize(false);
        rvQuestion2.setAdapter(gejalaAdapter2 = new GejalaAdapter2());

        Bundle bundle = getIntent().getExtras();
        List<ViewDataGejalaResponse> viewDataGejalaResponses = (List<ViewDataGejalaResponse>)bundle.getSerializable("data");
        gejalaAdapter2.updateList(viewDataGejalaResponses);
        gejalaAdapter2.setAdapterListener(this);
        pbQuestion2.setVisibility(View.GONE);

        ArrayList<String> temporary1 = getIntent().getStringArrayListExtra("temporary1");
        temporary.addAll(temporary1);
    }


    @OnClick(R.id.btnLanjut)
    public void btnLanjut(){
        Intent intent = new Intent(DiagnosaActivity2.this, ResultPenyakit.class);
        intent.putStringArrayListExtra("data", temporary);
        intent.putExtra("golonganDarah", getIntent().getStringExtra("golonganDarah"));
        startActivity(intent);
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
