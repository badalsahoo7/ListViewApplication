package com.example.listviewapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class BadalAdapter extends ArrayAdapter {
private String []arr;
    public BadalAdapter(@NonNull Context context, int resource , @NonNull String[]arr) {
        super(context,resource,arr);
        this.arr=arr;
    }

    @Nullable
    @Override
    public Object getItem(int position) {
        return arr[position];
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView= LayoutInflater.from(getContext()).inflate(R.layout.my_badal_layout,parent,false);
       TextView textView =  convertView.findViewById(R.id.textView);
       textView.setText((CharSequence) getItem(position));
       return convertView;

    }
}
