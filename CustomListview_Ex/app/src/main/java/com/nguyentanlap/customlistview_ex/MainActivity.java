package com.nguyentanlap.customlistview_ex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Country> dsQG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        dsQG = new ArrayList<>();
        Country qg1 = new Country("VietNam", "vn", 900000);
        Country qg2 = new Country("US", "us", 1000000);
        Country qg3 = new Country("Russia", "ru", 800000);
        dsQG.add(qg1);
        dsQG.add(qg2);
        dsQG.add(qg3);

        // tim dieu khien
        ListView lvQG = findViewById(R.id.lisViewNation);

        // Tao adapter
        CountryAdapter adapter;
        adapter = new CountryAdapter(dsQG, this);

        // Gan adapter
        lvQG.setAdapter(adapter);

        // Xu ly su kien, nhu bai cu

    }
}