package com.nguyentanlap.intent_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnmh2;
    Button btnmh3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWidget();

        btnmh2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent2 = new Intent(MainActivity.this,MH2Activity.class);
                startActivity(intent2);
            }
        });

        btnmh3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(MainActivity.this,MH3Activity.class);
                startActivity(intent3);
            }
        });


    }
    void getWidget(){
        btnmh2 = (Button) findViewById(R.id.btnMH2);
        btnmh3 = (Button) findViewById(R.id.btnMH3);
    }


}