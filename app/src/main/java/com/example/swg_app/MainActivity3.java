package com.example.swg_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity3 extends AppCompatActivity {
    private static final String TAG = "MainActivity3";

    GridView gridView;

    private String[] url_id = {"http://www.facebook.com","http://www.google.com","http://www.google.com","http://www.google.com",
            "http://www.google.com","http://www.google.com","http://www.google.com","http://www.google.com","http://www.google.com",
            "http://www.google.com","http://www.google.com","http://www.facebook.com","http://www.google.com","http://www.google.com",
            "http://www.google.com","http://www.google.com","http://www.google.com","http://www.google.com","http://www.google.com",
            "http://www.google.com","http://www.google.com","http://www.facebook.com"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Log.d(TAG,"onCreate: Started");
        gridView = (GridView)findViewById(R.id.knowdepgrid);
        CellAdapter cellAdapter = new CellAdapter(this);
        gridView.setAdapter(cellAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(view.getContext(),webView.class);
                intent.putExtra("url", url_id[position]);
                startActivity(intent);
            }
        });
    }
}