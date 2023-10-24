package com.nguyentanlap.appnhahang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvMonAn = (ListView) findViewById(R.id.lvMon);

        ArrayList<MonAn> dsMon =new ArrayList<>();
        dsMon.add(new MonAn("Cơm tấm sườn",25000,"Chỉ có sườn thôi",R.drawable.pokemon1));
        dsMon.add(new MonAn("Cơm sườn trứng",25000,"Chỉ có sườn với thêm cái trứng ",R.drawable.pokemon2));
        dsMon.add(new MonAn("Cơm gà tiêu đen",25000,"Chỉ có gà sốt tiêu đen",R.drawable.pokemon3));

        MonAnAdapter anAdapter = new MonAnAdapter(dsMon,this);

        lvMonAn.setAdapter(anAdapter);

        lvMonAn.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


            }
        });
    }
}