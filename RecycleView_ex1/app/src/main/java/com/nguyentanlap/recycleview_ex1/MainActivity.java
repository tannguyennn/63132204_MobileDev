package com.nguyentanlap.recycleview_ex1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    CountryRVAdapter countryRVAdapter;
    ArrayList<Country> ds = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Country qg1 = new Country("Vietnam","vn",80);
        Country qg2 = new Country("United State","us",68);
        Country qg3 = new Country("Russia","ru",120);
        ds.add(qg1);
        ds.add(qg2);
        ds.add(qg3);

        RecyclerView recyclerView =(RecyclerView) findViewById(R.id.myrecycleView);
        LinearLayoutManager llm = new LinearLayoutManager(this);

        DividerItemDecoration itemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        itemDecoration.setDrawable(ContextCompat.getDrawable(this,R.drawable.divider));
        recyclerView.addItemDecoration(itemDecoration);
        countryRVAdapter= new CountryRVAdapter(ds);
        recyclerView.setAdapter(countryRVAdapter);
        countryRVAdapter.notifyDataSetChanged();

    }
}