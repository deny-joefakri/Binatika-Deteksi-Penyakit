package com.binatika.deteksigolongandarah.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.binatika.deteksigolongandarah.R;
import com.binatika.deteksigolongandarah.view.base.BaseActivity;

import butterknife.OnClick;

/**
 * Created by dev_deny on 5/3/17.
 */

public class ChooseBloodActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setLayout(R.layout.activity_choose_blood, this);
    }

    @OnClick(R.id.btnA)
    public void a(){
        Intent intent = new Intent(ChooseBloodActivity.this, DiagnosaActivity.class);
        intent.putExtra("type", "A");
        startActivity(intent);
    }

    @OnClick(R.id.btnB)
    public void b(){
        Intent intent = new Intent(ChooseBloodActivity.this, DiagnosaActivity.class);
        intent.putExtra("type", "B");
        startActivity(intent);
    }

    @OnClick(R.id.btnAB)
    public void ab(){
        Intent intent = new Intent(ChooseBloodActivity.this, DiagnosaActivity.class);
        intent.putExtra("type", "AB");
        startActivity(intent);
    }

    @OnClick(R.id.btnO)
    public void o(){
        Intent intent = new Intent(ChooseBloodActivity.this, DiagnosaActivity.class);
        intent.putExtra("type", "O");
        startActivity(intent);
    }
}
