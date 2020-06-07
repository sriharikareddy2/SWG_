package com.example.swg_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView list= (ListView)findViewById(R.id.theList);
        Log.d(TAG,"onCreate: Started");

        final ArrayList<String>  portfolio = new ArrayList<>();
        portfolio.add("Internship");
        portfolio.add("Placement");
        portfolio.add("Know your department");

        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.activity_listview, portfolio);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent myintent = new Intent(view.getContext(),MainActivity1.class);
                    startActivityForResult(myintent,0);
                }
                if(position==1){
                    Intent myintent = new Intent(view.getContext(),MainActivity2.class);
                    startActivityForResult(myintent,1);
                }
                if(position==2){
                    Intent myintent = new Intent(view.getContext(),MainActivity3.class);
                    startActivityForResult(myintent,2);
                }
            }
        });
    }
}