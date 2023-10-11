package com.nguyentanlap.listview_simple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> danhsachNQH = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        get();
        danhsachNQH.add("C");
        danhsachNQH.add("C#");
        danhsachNQH.add("Python");
        danhsachNQH.add("Java");
        danhsachNQH.add("Ruby");
        danhsachNQH.add("HTML");
        ArrayAdapter<String> adapterNQH = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,danhsachNQH);
        lvNQH.setAdapter(adapterNQH);
        lvNQH.setOnClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String mucChon = danhsachNQH.get(i);
                String chuoithongbao= "you selected" + mucChon;
                Toast.makeText(MainActivity.this,chuoithongbao,Toast.LENGTH_LONG).show();
            }
        });
    }
    public void get(){
        lvNQH = findViewById(R.id.LVNQH);
    }
    ListView lvNQH;
}