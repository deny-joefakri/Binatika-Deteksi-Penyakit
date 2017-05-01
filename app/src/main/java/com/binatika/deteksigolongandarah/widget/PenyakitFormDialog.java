package com.binatika.deteksigolongandarah.widget;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.binatika.deteksigolongandarah.R;
import com.binatika.deteksigolongandarah.model.PenyakitModel;


/**
 * Created by dev_deny on 10/14/16.
 */
public class PenyakitFormDialog extends DialogFragment {

    OnListener onListener;

    public static PenyakitFormDialog newIntance(String view, String kode_penyakit, int total_data) {
        PenyakitFormDialog messageDialog = new PenyakitFormDialog();
        Bundle bundle = new Bundle();
        bundle.putCharSequence("view", view);
        bundle.putCharSequence("kode", kode_penyakit);
        bundle.putInt("total", total_data);
        messageDialog.setArguments(bundle);
        return messageDialog;
    }

    public void setOnListener(OnListener onListener){
        this.onListener = onListener;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dialog_penyakit_form, container, false);
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

        String view = getArguments().getString("view");

        final EditText ed_kode_penyakit = (EditText) v.findViewById(R.id.ed_kode_penyakit);
        final EditText ed_nama_penyakit = (EditText) v.findViewById(R.id.ed_nama_penyakit);
        final EditText ed_penyebab = (EditText) v.findViewById(R.id.ed_penyebab);
        final EditText ed_pengobatan = (EditText) v.findViewById(R.id.ed_pengobatan);

        LinearLayout viewEditDelete = (LinearLayout) v.findViewById(R.id.viewEditDelete);
        Button btnTambah = (Button) v.findViewById(R.id.btnTambah);
        Button btnEdit = (Button) v.findViewById(R.id.btnEdit);
        Button btnHapus = (Button) v.findViewById(R.id.btnHapus);

        if (view.equals("1")){
            btnTambah.setVisibility(View.VISIBLE);
            viewEditDelete.setVisibility(View.GONE);
        } else {
            btnTambah.setVisibility(View.GONE);
            viewEditDelete.setVisibility(View.VISIBLE);

            PenyakitModel penyakitModel = new PenyakitModel();

            ed_kode_penyakit.setText(penyakitModel.getKode_penyakit());
            ed_nama_penyakit.setText(penyakitModel.getNama_penyakit());
            ed_penyebab.setText(penyakitModel.getPenyebab());
            ed_pengobatan.setText(penyakitModel.getPengobatan());


        }

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PenyakitModel penyakitModel = new PenyakitModel();

                penyakitModel.setId(System.currentTimeMillis()+getArguments().getInt("total"));
                penyakitModel.setKode_penyakit(ed_kode_penyakit.getText().toString());
                penyakitModel.setNama_penyakit(ed_nama_penyakit.getText().toString());
                penyakitModel.setPengobatan(ed_pengobatan.getText().toString());
                penyakitModel.setPenyebab(ed_penyebab.getText().toString());

                if (ed_kode_penyakit.getText() == null || ed_kode_penyakit.getText().toString().equals("") || ed_kode_penyakit.getText().toString().equals(" ")) {
                    Toast.makeText(getActivity(), "Kode Penyakit tidak boleh kosong", Toast.LENGTH_SHORT).show();
                } else if (ed_nama_penyakit.getText() == null || ed_nama_penyakit.getText().toString().equals("") || ed_nama_penyakit.getText().toString().equals(" ")) {
                    Toast.makeText(getActivity(), "Nama Penyakit tidak boleh kosong", Toast.LENGTH_SHORT).show();
                } else if (ed_pengobatan.getText() == null || ed_pengobatan.getText().toString().equals("") || ed_pengobatan.getText().toString().equals(" ")) {
                    Toast.makeText(getActivity(), "Pengobatan tidak boleh kosong", Toast.LENGTH_SHORT).show();
                } else if (ed_penyebab.getText() == null || ed_penyebab.getText().toString().equals("") || ed_penyebab.getText().toString().equals(" ")) {
                    Toast.makeText(getActivity(), "Penyebab tidak boleh kosong", Toast.LENGTH_SHORT).show();
                } else {

                    PenyakitModel penyakit = new PenyakitModel();
                    if (penyakit == null){

                        onListener.onFinish();
                        dismiss();
                    } else {
                        Toast.makeText(getActivity(), "Kode Penyakit tidak boleh sama", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });

        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PenyakitModel penyakitModel = new PenyakitModel();
                penyakitModel.setKode_penyakit(ed_kode_penyakit.getText().toString());
                penyakitModel.setNama_penyakit(ed_nama_penyakit.getText().toString());
                penyakitModel.setPengobatan(ed_pengobatan.getText().toString());
                penyakitModel.setPenyebab(ed_penyebab.getText().toString());

                onListener.onFinish();
                dismiss();
            }
        });

        btnHapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PenyakitModel penyakitModel = new PenyakitModel();

                onListener.onFinish();
                dismiss();
            }
        });
    }

    public interface OnListener {
        public void onFinish();
    }

}