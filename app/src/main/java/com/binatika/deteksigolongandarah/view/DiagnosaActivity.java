package com.binatika.deteksigolongandarah.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

import com.binatika.deteksigolongandarah.R;
import com.binatika.deteksigolongandarah.adapter.GejalaAdapter;
import com.binatika.deteksigolongandarah.model.HasilPenyakitModel;
import com.binatika.deteksigolongandarah.model.PenyakitModel;
import com.binatika.deteksigolongandarah.view.base.BaseActivity;
import com.binatika.deteksigolongandarah.model.Model;
import com.binatika.deteksigolongandarah.model.GejalaPenyakitModel;
import com.binatika.deteksigolongandarah.realm.RealmController;
import com.binatika.deteksigolongandarah.widget.SingleSpinnerAdapter;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.OnClick;
import io.realm.Realm;
import io.realm.RealmResults;

/**
 * Created by dev_deny on 3/26/17.
 */

public class DiagnosaActivity extends BaseActivity implements GejalaAdapter.AdapterListener{

    @BindView(R.id.spnGolonganDarah) Spinner spnGolonganDarah;
    @BindView(R.id.rvAnswer) RecyclerView rvAnswer;
    @BindView(R.id.rvGejala) RecyclerView rvGejala;
    GejalaAdapter gejalaAdapter;

    Realm realm;
    ArrayList<String> temporary;
    String golonganDarah = "";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setLayout(R.layout.activity_diagnosa, this);
        initView();

        temporary = new ArrayList<>();
        realm = RealmController.with(this).getRealm();
        RealmController.with(this).refresh();

        rvGejala.setLayoutManager(new LinearLayoutManager(this));
        rvGejala.setNestedScrollingEnabled(false);
        rvGejala.setHasFixedSize(false);
        rvGejala.setAdapter(gejalaAdapter = new GejalaAdapter());
        initDataGejala();

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
                initDataGejala();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void initDataGejala(){

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

    }

    @Override
    public void onClick(Model model) {
        if (!model.isChecked()){
            for (int i = 0; i < temporary.size(); i++) {
                if (temporary.get(i).equals(model.getKode())) {
                    temporary.remove(i);
                }
            }
        } else {
            temporary.add(model.getKode());
        }
    }

    @OnClick(R.id.btnLanjut)
    public void btnLanjut(){
        Intent intent = new Intent(DiagnosaActivity.this, ResultPenyakit.class);
        intent.putStringArrayListExtra("data", temporary);
        intent.putExtra("golonganDarah", golonganDarah);
        startActivity(intent);
    }

}
