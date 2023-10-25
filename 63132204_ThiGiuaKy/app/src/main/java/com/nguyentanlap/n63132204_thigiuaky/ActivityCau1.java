package com.nguyentanlap.n63132204_thigiuaky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class ActivityCau1 extends AppCompatActivity {

    EditText editText_A;
    EditText editText_B;
    TextView tvKQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cau1);
        getWidget();

        Button btn = (Button) findViewById(R.id.btnback1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityCau1.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void getWidget() {
        editText_A = (EditText) findViewById(R.id.num1);
        editText_B = (EditText) findViewById(R.id.num2);
        tvKQ = (TextView) findViewById(R.id.tvResult);
    }

    public void Xuly_Cong(View v) {
        int soA = Integer.parseInt(editText_A.getText().toString());
        int soB = Integer.parseInt(editText_B.getText().toString());
        int ketQua = soA + soB;
        tvKQ.setText(String.valueOf(ketQua));
    }

    public void Xuly_Tru(View v) {
        int soA = Integer.parseInt(editText_A.getText().toString());
        int soB = Integer.parseInt(editText_B.getText().toString());
        int ketQua = soA - soB;
        tvKQ.setText(String.valueOf(ketQua));
    }

    public void Xuly_Nhan(View v) {
        int soA = Integer.parseInt(editText_A.getText().toString());
        int soB = Integer.parseInt(editText_B.getText().toString());
        int ketQua = soA * soB;
        tvKQ.setText(String.valueOf(ketQua));
    }

    public void Xuly_Chia(View v) {
        int soA = Integer.parseInt(editText_A.getText().toString());
        int soB = Integer.parseInt(editText_B.getText().toString());
        int ketQua = soA / soB;
        tvKQ.setText(String.valueOf(ketQua));
    }
}