package com.binatika.deteksigolongandarah.adapter;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import com.binatika.deteksigolongandarah.R;
import com.binatika.deteksigolongandarah.model.Model;
import com.binatika.deteksigolongandarah.model.PenyakitModel;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by air-water on 2/12/17.
 */

public class DataPenyakitAdapter extends RecyclerView.Adapter{
    private ArrayList<PenyakitModel> list;
    AdapterListener adapterListener;

    public DataPenyakitAdapter(){
        list = new ArrayList<>();

    }

    public void updateList(ArrayList<PenyakitModel> listModels) {
        this.list = listModels;
        notifyDataSetChanged();
    }

    public void setAdapterListener(AdapterListener adapterListener) {
        this.adapterListener = adapterListener;
    }

    public PenyakitModel getItem(int position) {
        return list.get(position);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_data, parent, false);
        return new Holder(v);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((Holder) holder).setValue(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        @BindView(R.id.txtKode) TextView txtKode;
        @BindView(R.id.txtNama) TextView txtNama;

        public Holder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void setValue(final PenyakitModel penyakitModel) {
            txtKode.setText(penyakitModel.getKode_penyakit());
            txtNama.setText(penyakitModel.getNama_penyakit());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    adapterListener.onClick(penyakitModel);
                }
            });

        }

    }

    public interface AdapterListener {
        void onClick(PenyakitModel penyakitModel);
    }
}