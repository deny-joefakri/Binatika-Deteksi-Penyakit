package com.binatika.deteksigolongandarah.util;

import android.support.v4.app.FragmentManager;

import com.binatika.deteksigolongandarah.widget.LoginDialog;
import com.binatika.deteksigolongandarah.widget.PenyakitFormDialog;

/**
 * Created by dev_deny on 4/1/17.
 */

public class Util {
    public static LoginDialog loginDialog(FragmentManager fragmentManager) {
        LoginDialog dialog = LoginDialog.newIntance();
        dialog.show(fragmentManager, "loginDialog");
        return dialog;
    }

    public static PenyakitFormDialog penyakitFormDialog(FragmentManager fragmentManager, String view, String kode_penyakit, int total_data) {
        PenyakitFormDialog dialog = PenyakitFormDialog.newIntance(view, kode_penyakit, total_data);
        dialog.show(fragmentManager, "penyakitFormDialog");
        return dialog;
    }
}
