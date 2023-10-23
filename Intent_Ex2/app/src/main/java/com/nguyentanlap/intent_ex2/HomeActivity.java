package com.nguyentanlap.intent_ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Intent intentTuLogin = getIntent();

        String ten = intentTuLogin.getStringExtra("tenDN");

        TextView tvTen = (TextView) findViewById(R.id.tvUserName);
        tvTen.setText(ten);
    }
}