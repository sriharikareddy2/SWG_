package com.example.swg_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    private static final String TAG = "MainActivity2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ListView list2= (ListView)findViewById(R.id.Placement);
        Log.d(TAG,"onCreate: Started");
        final ArrayList<String> Placement = new ArrayList<>();
        Placement.add("Software");
        Placement.add("Data analysis");
        Placement.add("Quant");
        Placement.add("Finance");

        ArrayAdapter adapter2 = new ArrayAdapter(this, R.layout.activity_listview, Placement);
        list2.setAdapter(adapter2);


    }
}