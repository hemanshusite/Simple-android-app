package com.example.listviewapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class HemanshuAdapter extends ArrayAdapter<String> {
    private String arr[];
    private Context context;
    public HemanshuAdapter(@NonNull Context context, int resource, @NonNull String[] arr) {
        super(context, resource, arr);
        this.arr=arr;
        this.context=context;
    }

    @Nullable
    @Override
    public String getItem(int position) {
        return super.getItem(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView= LayoutInflater.from(getContext()).inflate(R.layout.my_hemanshu_layout,parent,false);
        TextView t;
        t=convertView.findViewById(R.id.t);
        t.setText(getItem(position));
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "You are in="+position, Toast.LENGTH_SHORT).show();
            }
        });
        return convertView;
    }
}
