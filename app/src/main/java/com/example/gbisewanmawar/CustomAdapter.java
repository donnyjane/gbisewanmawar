package com.example.gbisewanmawar;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 *Created by DONNY on 19/5/2021.
 */

class CustomAdapter extends BaseAdapter{

    private String[] hari;
    private Integer[] gambar;
    private Activity activity;

    public CustomAdapter(Activity fragmentHarian, String[] hari, Integer[] gambar) {
        this.hari = hari;
        this.gambar = gambar;
        activity = fragmentHarian;
    }

    @Override
    public int getCount() {
        return hari.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater)activity.getSystemService(activity
        .LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.list_hari, null);

        TextView nama_hari = (TextView) v.findViewById(R.id.txthari);
        ImageView gambar_hari = (ImageView) v.findViewById(R.id.imglist);

        //Tampilkan data pada komponen
        nama_hari.setText(hari[i]);
        gambar_hari.setImageResource(gambar[i]);
        nama_hari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent renungan = new Intent(activity,RenunganHarian.class);
                renungan.putExtra("Hari",hari[i]);
                activity.startActivity(renungan);
            }
        });
        return v;
    }
    
}