package com.nguyentanlap.n63132204_thigiuaky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class ActivityCau3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cau3);

        Button btn = (Button) findViewById(R.id.btnback3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityCau3.this,MainActivity.class);
                startActivity(intent);
            }
        });

        ListView lvDV = (ListView) findViewById(R.id.lvDVCau3);

        ArrayList<DongVat> dsDV = new ArrayList<>();
        dsDV.add(new DongVat("Sư tử","Ăn thịt",5000,R.drawable.sutu));
        dsDV.add(new DongVat("Hổ","Ăn thịt",10000,R.drawable.ho));
        dsDV.add(new DongVat("Ngựa vằn","Ăn cỏ",15000,R.drawable.nguavan));
        dsDV.add(new DongVat("Gấu trúc","Ăn tạp",6000,R.drawable.gautruc));
        dsDV.add(new DongVat("Hươu cao cổ","Ăn cỏ",5000,R.drawable.huoucaoco));

        DongVatAdapter adapter =new DongVatAdapter(dsDV,this);

        lvDV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                DongVat dvHientai = dsDV.get(i);

                Intent myintent = new Intent(ActivityCau3.this, CustomDongVatActivity.class);

                myintent.putExtra("ten",dvHientai.getTen());
                myintent.putExtra("taptinh",dvHientai.getTapTinh());
                myintent.putExtra("soluong",dvHientai.getSoLuong());
                myintent.putExtra("anh",dvHientai.getIdAnh());

                startActivity(myintent);
            }
        });
    }
}