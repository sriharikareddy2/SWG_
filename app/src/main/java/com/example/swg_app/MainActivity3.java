package com.example.swg_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.GridView;

public class MainActivity3 extends AppCompatActivity {
    private static final String TAG = "MainActivity3";

    GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Log.d(TAG,"onCreate: Started");
        gridView = (GridView)findViewById(R.id.knowdepgrid);

        CellAdapter cellAdapter = new CellAdapter(this);
        gridView.setAdapter(cellAdapter);
    }
}