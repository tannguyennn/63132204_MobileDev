package com.nguyentanlap.n63132204_thigiuaky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_cau1 =(Button) findViewById(R.id.btnCau1);
        Button btn_cau2 =(Button) findViewById(R.id.btnCau2);
        Button btn_cau3 =(Button) findViewById(R.id.btnCau3);
        Button btn_cau4 =(Button) findViewById(R.id.btnCau4);

        btn_cau1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ActivityCau1.class);
                startActivity(intent);
            }
        });
        btn_cau2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ActivityCau2.class);
                startActivity(intent);
            }
        });
        btn_cau3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ActivityCau3.class);
                startActivity(intent);
            }
        });
        btn_cau4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ActivityCau4.class);
                startActivity(intent);
            }
        });
    }
}