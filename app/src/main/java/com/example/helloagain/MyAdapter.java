package com.example.helloagain;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.helloagain.R;

class MyAdapter extends ArrayAdapter<String> {


    public MyAdapter(Context context, String[] values) {
        super(context, R.layout.row_layout, values);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater myInflater = LayoutInflater.from(getContext());
        View myView = myInflater.inflate(R.layout.row_layout, parent, false);

        String tvShow = getItem(position);
        TextView myTextView = (TextView) myView.findViewById(R.id.textView1);
        myTextView.setText(tvShow);

        ImageView myimageview = (ImageView) myView.findViewById(R.id.imageview);
        myimageview.setImageResource(R.drawable.ic_launcher);

        return myView;
    }
}