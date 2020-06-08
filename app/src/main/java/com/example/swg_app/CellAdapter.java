package com.example.swg_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CellAdapter extends BaseAdapter {

    private int[] image_id = {R.drawable.one,R.drawable.two,R.drawable.one};
    private String[] dep_name = {"CS","Aero","Biotech"};
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
