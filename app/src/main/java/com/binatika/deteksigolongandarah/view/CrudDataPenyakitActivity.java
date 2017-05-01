package com.binatika.deteksigolongandarah.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.binatika.deteksigolongandarah.R;
import com.binatika.deteksigolongandarah.adapter.DataPenyakitAdapter;
import com.binatika.deteksigolongandarah.adapter.GejalaAdapter;
import com.binatika.deteksigolongandarah.model.GejalaPenyakitModel;
import com.binatika.deteksigolongandarah.model.HasilPenyakitModel;
import com.binatika.deteksigolongandarah.model.Model;
import com.binatika.deteksigolongandarah.model.PenyakitModel;
import com.binatika.deteksigolongandarah.util.Util;
import com.binatika.deteksigolongandarah.view.base.BaseActivity;
import com.binatika.deteksigolongandarah.widget.PenyakitFormDialog;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by dev_deny on 4/2/17.
 */

public class CrudDataPenyakitActivity extends BaseActivity implements DataPenyakitAdapter.AdapterListener, PenyakitFormDialog.OnListener{

    @BindView(R.id.rvData) RecyclerView rvData;
    DataPenyakitAdapter dataPenyakitAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setLayout(R.layout.activity_crud_data, this);


        rvData.setLayoutManager(new LinearLayoutManager(this));
        rvData.setNestedScrollingEnabled(false);
        rvData.setHasFixedSize(false);
        rvData.setAdapter(dataPenyakitAdapter = new DataPenyakitAdapter());

        initList();
    }

    public void initList(){

        ArrayList<PenyakitModel> data = new ArrayList<>();


        dataPenyakitAdapter.updateList(data);
        dataPenyakitAdapter.setAdapterListener(this);

    }

    @OnClick(R.id.btnTambah)
    public void btnTambah(){
        Util.penyakitFormDialog(getSupportFragmentManager(), "1", "", dataPenyakitAdapter.getItemCount()).setOnListener(this);
    }

    @OnClick(R.id.btnBatal)
    public void btnBatal(){
        finish();
    }

    @OnClick(R.id.btnKeluar)
    public void btnKeluar(){
        finish();
    }

    @Override
    public void onClick(PenyakitModel penyakitModel) {
        Util.penyakitFormDialog(getSupportFragmentManager(), "2", penyakitModel.getKode_penyakit(),
                dataPenyakitAdapter.getItemCount()).setOnListener(this);
    }

    @Override
    public void onFinish() {
        initList();
    }
}
