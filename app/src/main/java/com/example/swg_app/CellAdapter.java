package com.example.swg_app;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CellAdapter extends BaseAdapter {

    private int[] image_id = {
            R.drawable.aero,R.drawable.agri,R.drawable.bio,R.drawable.chem,
            R.drawable.chemical,R.drawable.civil,R.drawable.cs,R.drawable.ece,
            R.drawable.ee,R.drawable.ageo,R.drawable.egeo,R.drawable.hss,
            R.drawable.indu,R.drawable.instru,R.drawable.mech,R.drawable.manu,
            R.drawable.mine,R.drawable.mnc,R.drawable.metal,R.drawable.ocean,
            R.drawable.physics,R.drawable.quality
    };
    private String[] dep_name = {
            "AE","AG","BT","CY",
            "CH","CE","CS","ECE",
            "EE","Applied GG","Exploration GG","HSS",
            "IE","IM","ME","MF",
            "MI","MNC","MT","OENA",
            "PH","QE"
    };
    Context ctx;
    CellAdapter(Context ctx){
        this.ctx = ctx;
    }

    @Override
    public int getCount(){
        return image_id.length;
    }

    @Override
    public Object getItem(int position){
        return image_id[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View gridView = convertView;

        if(gridView==null){
            LayoutInflater inflater = (LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            gridView = inflater.inflate(R.layout.custom_knowdep,null);
        }

        ImageView i1 = (ImageView)gridView.findViewById(R.id.depimg);
        TextView t1 = (TextView)gridView.findViewById(R.id.depname);
        i1.setImageResource((image_id[position]));
        t1.setText(dep_name[position]);

        return gridView;
    }
}
