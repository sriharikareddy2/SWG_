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
    private String[] url_id={"https://medium.com/@swgiitkgp/know-your-department-aerospace-engineering-2f56a3572ffe","https://medium.com/@swgiitkgp/know-your-department-agricultural-and-food-engineering-99f88ff9d8a8","https://medium.com/@swgiitkgp/know-your-department-biotechnology-2e105384ce43","https://medium.com/@swgiitkgp/know-your-department-chemistry-ce8973b56a67","https://medium.com/@swgiitkgp/know-your-department-chemical-engineering-c54d2bc608d5","https://medium.com/@swgiitkgp/know-your-department-civil-engineering-63caabd97cb0","https://medium.com/@swgiitkgp/know-your-department-computer-science-and-engineering-24392aab7146","https://medium.com/@swgiitkgp/know-your-department-electronics-and-electrical-communications-engineering-4bf6a043475","https://medium.com/@swgiitkgp/know-your-department-electrical-engineering-7a66cc2a80d3","https://medium.com/@swgiitkgp/know-your-department-geology-and-geophysics-31fd09664b3d","https://medium.com/@swgiitkgp/know-your-branch-exploration-geophysics-dd30c110b444","https://medium.com/@swgiitkgp/know-your-branch-economics-67e8b350a5de","https://medium.com/@swgiitkgp/know-your-department-industrial-and-systems-engineering-50fe3321bd6d","https://medium.com/@swgiitkgp/know-your-branch-instrumentation-engineering-726b62c0ce78","https://medium.com/@swgiitkgp/know-your-department-mechanical-engineering-bf4aaa54e8d","https://medium.com/@swgiitkgp/know-your-branch-manufacturing-science-and-engineering-894e2a2346d2","https://medium.com/@swgiitkgp/know-your-department-mining-engineering-2c37de00793f","https://medium.com/@swgiitkgp/know-your-department-mathematics-d5ad3ff992f4","https://medium.com/@swgiitkgp/know-your-department-metallurgical-and-materials-engineering-26d1070cec97","https://medium.com/@swgiitkgp/know-your-department-ocean-engineering-and-naval-architecture-82ebca5c6bdf","https://medium.com/@swgiitkgp/know-your-department-physics-da4bdb49af6b","https://medium.com/@swgiitkgp/know-your-branch-quality-engineering-design-and-manufacturing-69329b687d2e"};

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