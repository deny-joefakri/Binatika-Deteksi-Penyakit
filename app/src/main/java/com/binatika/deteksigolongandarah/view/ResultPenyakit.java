package com.binatika.deteksigolongandarah.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.TextView;

import com.binatika.deteksigolongandarah.R;
import com.binatika.deteksigolongandarah.model.GejalaPenyakitModel;
import com.binatika.deteksigolongandarah.model.HasilPenyakitModel;
import com.binatika.deteksigolongandarah.model.PenyakitModel;
import com.binatika.deteksigolongandarah.realm.RealmController;
import com.binatika.deteksigolongandarah.view.base.BaseActivity;

import java.util.ArrayList;

import butterknife.BindView;
import io.realm.Realm;
import io.realm.RealmResults;

/**
 * Created by dev_deny on 3/26/17.
 */

public class ResultPenyakit extends BaseActivity {

    @BindView(R.id.resultPenyakit) TextView resultPenyakit;
    Realm realm;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setLayout(R.layout.activity_hasil, this);

        realm = RealmController.with(this).getRealm();
        RealmController.with(this).refresh();

        result();
    }

    public void result(){
        ArrayList<String> dataReceiver = getIntent().getStringArrayListExtra("data");
        String golongan_darah = getIntent().getStringExtra("golonganDarah");
        Log.e("golonganDarah", golongan_darah);

        String temporaryValue = "";
        ArrayList<String> resultData = new ArrayList<>();
        for (int i = 0; i < dataReceiver.size(); i++) {
            Log.e("receiver", dataReceiver.get(i));
            RealmResults<HasilPenyakitModel> getData = RealmController.with(this).hasilAkhirWithGejala(golongan_darah, dataReceiver.get(i));
            for (int j = 0; j < getData.size(); j++) {
                if (!getData.get(j).getKode_penyakit().equals(temporaryValue)){
                    temporaryValue = getData.get(j).getKode_penyakit();
                    PenyakitModel getPenyakit = RealmController.with(this).getPenyakit(getData.get(j).getKode_penyakit());
                    resultData.add(getPenyakit.getNama_penyakit());
                    Log.e("kode penyakit", getData.get(j).getKode_penyakit());
                    Log.e("nama penyakit", getPenyakit.getNama_penyakit());
                }
            }
        }

        for (int i = 0; i < resultData.size(); i++) {
            if (resultData.size() == 1) {
                resultPenyakit.setText(resultData.get(0));
            } else if (resultData.size() == 2) {
                resultPenyakit.setText(resultData.get(0) + resultData.get(1));
            } else if (resultData.size() == 3) {
                resultPenyakit.setText(resultData.get(0) + resultData.get(1) + resultData.get(2));
            } else {
                resultPenyakit.setText(resultData.get(0) + resultData.get(1) + resultData.get(2) + resultData.get(3));
            }
        }

    }
}
