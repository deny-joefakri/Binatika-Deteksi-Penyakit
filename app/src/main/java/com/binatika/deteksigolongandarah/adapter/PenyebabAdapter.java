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
import com.binatika.deteksigolongandarah.model.TextModel;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by air-water on 2/12/17.
 */

public class PenyebabAdapter extends RecyclerView.Adapter{
    private ArrayList<TextModel> list;

    public PenyebabAdapter(){
        list = new ArrayList<>();

    }

    public void updateList(ArrayList<TextModel> listModels) {
        this.list = listModels;
        notifyDataSetChanged();
    }

    public TextModel getItem(int position) {
        return list.get(position);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_teks, parent, false);
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
        @BindView(R.id.titleItem) TextView titleItem;

        public Holder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void setValue(final TextModel value) {
            titleItem.setText(value.getText());
        }

    }


}