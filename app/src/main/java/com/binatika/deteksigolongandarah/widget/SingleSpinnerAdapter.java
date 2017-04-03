package com.binatika.deteksigolongandarah.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import com.binatika.deteksigolongandarah.R;

import java.util.ArrayList;

/**
 * Created by denyjoefakri on 10/14/16.
 */

public class SingleSpinnerAdapter extends ArrayAdapter {

    Context context;
    ArrayList<String> item;
    int itemLayout;
    LayoutInflater inflater;

    public SingleSpinnerAdapter(Context context, LayoutInflater inflater, ArrayList<String> item) {
        super(context, R.layout.item_single_spinner_adapter, item);
        this.context = context;
        this.inflater = inflater;
        this.itemLayout = R.layout.item_single_spinner_adapter;
        this.item = item;
    }

    public View getCustomView(int position, View convertView, ViewGroup parent) {
        View layout = inflater.inflate(R.layout.item_single_spinner_adapter, parent, false);
        TextView tvTitle = (TextView) layout.findViewById(R.id.item_spinner_text);
        tvTitle.setText(item.get(position));
        return layout;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        return getCustomView(position, convertView, parent);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return getCustomView(position, convertView, parent);
    }
}