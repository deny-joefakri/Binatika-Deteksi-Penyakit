package com.binatika.deteksigolongandarah.widget;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;

import com.binatika.deteksigolongandarah.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;


/**
 * Created by dev_deny on 10/14/16.
 */
public class LoginDialog extends DialogFragment {

    private OnLogin onLogin;

    public static LoginDialog newIntance() {
        LoginDialog messageDialog = new LoginDialog();
        Bundle bundle = new Bundle();
        bundle.putCharSequence("message", "");
        messageDialog.setArguments(bundle);
        return messageDialog;
    }

    public void setOnLogin(OnLogin onLogin) {
        this.onLogin = onLogin;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dialog_login, container, false);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(DialogFragment.STYLE_NO_TITLE, R.style.CustomDialog);
    }

    @Override
    public void onViewCreated(View v, @Nullable Bundle savedInstanceState) {
        getDialog().requestWindowFeature(Window.FEATURE_NO_TITLE);
        setStyle(STYLE_NO_FRAME, 0);

        final EditText ed_username = (EditText) v.findViewById(R.id.ed_username);
        final EditText ed_password = (EditText) v.findViewById(R.id.ed_password);

        TextView btnOke = (TextView) v.findViewById(R.id.dialog_ok);
        btnOke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onLogin != null) {
                    onLogin.onLogin(ed_username.getText().toString(), ed_password.getText().toString());
                }
                dismiss();
            }
        });
    }

    public interface OnLogin {
        public void onLogin(String username, String password);
    }
}