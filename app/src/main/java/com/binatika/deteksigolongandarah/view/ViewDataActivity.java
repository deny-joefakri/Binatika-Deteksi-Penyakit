package com.binatika.deteksigolongandarah.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.binatika.deteksigolongandarah.R;
import com.binatika.deteksigolongandarah.view.base.BaseActivity;

import butterknife.OnClick;

/**
 * Created by dev_deny on 4/2/17.
 */

public class ViewDataActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setLayout(R.layout.activity_list_data, this);
    }

    @OnClick(R.id.btnPenyakit)
    public void btnPenyakit(){
        startActivity(new Intent(ViewDataActivity.this, CrudDataPenyakitActivity.class));
    }

    @OnClick(R.id.btnGejala)
    public void btnGejala(){

    }

    @OnClick(R.id.btnPertanyaan)
    public void btnPertanyaan(){

    }

    @OnClick(R.id.btnInformasiPenyakit)
    public void btnInformasiPenyakit(){

    }

}
