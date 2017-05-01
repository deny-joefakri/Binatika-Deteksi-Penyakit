package com.binatika.deteksigolongandarah.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;

import com.binatika.deteksigolongandarah.R;
import com.binatika.deteksigolongandarah.model.HasilPenyakitModel;
import com.binatika.deteksigolongandarah.model.UserModel;
import com.binatika.deteksigolongandarah.util.UserPreference;
import com.binatika.deteksigolongandarah.util.Util;
import com.binatika.deteksigolongandarah.view.base.BaseActivity;
import com.binatika.deteksigolongandarah.widget.LoginDialog;

import butterknife.OnClick;

/**
 * Created by dev_deny on 3/26/17.
 */

public class DashboardActivity extends BaseActivity{

    UserPreference userPreference;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setLayout(R.layout.activity_dashboard, this);
        userPreference = UserPreference.getInstance(this);

        if (!userPreference.getInput()){
        }
    }

    @OnClick(R.id.btnDiagnosa)
    public void btnDiagnosa(){
        startActivity(new Intent(DashboardActivity.this, DiagnosaActivity.class));
    }

    @OnClick(R.id.btnUpdate)
    public void btnUpdate(){
        Util.loginDialog(getSupportFragmentManager()).setOnLogin(new LoginDialog.OnLogin() {
            @Override
            public void onLogin(String username, String password) {
                startActivity(new Intent(DashboardActivity.this, ViewDataActivity.class));
                /*UserModel user = RealmController.with(DashboardActivity.this).getUser(username, password);
                if (user != null){
                    Toast.makeText(getApplicationContext(), "Login Sukses", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(DashboardActivity.this, ViewDataActivity.class));
                } else {
                    Toast.makeText(getApplicationContext(), "Username atau Password salah", Toast.LENGTH_SHORT).show();
                }*/
            }
        });
    }

    @OnClick(R.id.btnBantuan)
    public void btnBantuan(){

    }

}
