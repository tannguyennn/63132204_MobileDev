package com.nguyentanlap.appnhahang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvMonAn = (ListView) findViewById(R.id.lvMon);

        ArrayList<MonAn> dsMon =new ArrayList<>();
        dsMon.add(new MonAn("Cơm tấm sườn",25000,"Chỉ có sường thôi",R.drawable.pokemon1));
        dsMon.add(new MonAn("Cơm tấm sườn",25000,"Chỉ có sường thôi",R.drawable.pokemon2));
        dsMon.add(new MonAn("Cơm tấm sườn",25000,"Chỉ có sường thôi",R.drawable.pokemon3));

    }
}