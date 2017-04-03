package com.binatika.deteksigolongandarah.view.base;


import android.app.Activity;
import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by telolet on 10/18/16.
 */

public class BaseActivity extends AppCompatActivity {

    public void setLayout(@LayoutRes int layout, Activity activity) {
        setContentView(layout);
        ButterKnife.bind(activity);
    }


}
