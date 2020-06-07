package com.example.swg_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity1 extends AppCompatActivity {
    private static final String TAG = "MainActivity1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        ListView list1= (ListView)findViewById(R.id.internship);
        Log.d(TAG,"onCreate: Started");
        final ArrayList<String> internship = new ArrayList<>();
        internship.add("Software");
        internship.add("Data analysis");
        internship.add("Quant");
        internship.add("Finance");

        ArrayAdapter adapter1 = new ArrayAdapter(this, R.layout.activity_listview, internship);
        list1.setAdapter(adapter1);

    }

}