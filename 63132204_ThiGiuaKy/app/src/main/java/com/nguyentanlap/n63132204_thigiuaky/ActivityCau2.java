package com.nguyentanlap.n63132204_thigiuaky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ActivityCau2 extends AppCompatActivity {
    ArrayList<String> danhsachDV = new ArrayList<>();
    ListView lvDVHD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cau2);
        get();

        Button btn = (Button) findViewById(R.id.btnback2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityCau2.this,MainActivity.class);
                startActivity(intent);
            }
        });


        danhsachDV.add("Sư tử");
        danhsachDV.add("Hổ");
        danhsachDV.add("Báo");
        danhsachDV.add("Gấu");
        danhsachDV.add("Ngựa");
        danhsachDV.add("Hươu cao cổ");

        ArrayAdapter<String> adapterDV = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, danhsachDV);
        lvDVHD.setAdapter(adapterDV);
        lvDVHD.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String chon = danhsachDV.get(i);
                String chuoi = "Bạn đã chọn " + chon;
                Toast.makeText(ActivityCau2.this,chuoi,Toast.LENGTH_LONG).show();
            }
        });

    }
    public void get(){
        lvDVHD = findViewById(R.id.lvDSDV);
    }

}