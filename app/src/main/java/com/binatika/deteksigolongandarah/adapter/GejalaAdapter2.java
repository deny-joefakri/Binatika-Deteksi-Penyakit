package com.binatika.deteksigolongandarah.adapter;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import com.binatika.deteksigolongandarah.R;
import com.binatika.deteksigolongandarah.api.ViewDataGejalaResponse;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by air-water on 2/12/17.
 */

public class GejalaAdapter2 extends RecyclerView.Adapter{
    private List<ViewDataGejalaResponse> list;
    AdapterListener adapterListener;

    public GejalaAdapter2(){
        list = new ArrayList<>();

    }

    public void updateList(List<ViewDataGejalaResponse> listModels) {
        this.list = listModels;
        notifyDataSetChanged();
    }

    public void setAdapterListener(AdapterListener adapterListener) {
        this.adapterListener = adapterListener;
    }

    public ViewDataGejalaResponse getItem(int position) {
        return list.get(position);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_gejala, parent, false);
        return new Holder(v);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (list.get(position).getKodePertanyaan().equals("P2"))
            ((Holder) holder).setValue(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        @BindView(R.id.titleItem) TextView titleItem;
        @BindView(R.id.ckItem) CheckBox ckItem;
        boolean isChecked;

        public Holder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void setValue(final ViewDataGejalaResponse value) {
            if (value.getKodePertanyaan().equals("P2")){
                titleItem.setText(value.getGejala());
                itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (ckItem.isChecked()){
                            ckItem.setChecked(false);
                            value.setChecked(false);
                            if (!value.isChecked()) Log.e("checked", "false");
                        } else {
                            ckItem.setChecked(true);
                            value.setChecked(true);
                            if (value.isChecked()) Log.e("checked", "true");
                        }
                        adapterListener.onClick(value);
                    }
                });
            }

        }

    }

    public interface AdapterListener {
        void onClick(ViewDataGejalaResponse model);
    }
}