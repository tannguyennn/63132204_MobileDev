package com.nguyentanlap.sohocdongian;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    EditText editText_A;
    EditText editText_B;
    TextView tvKQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWidget();
    }

    public void getWidget() {
        editText_A = (EditText) findViewById(R.id.editA);
        editText_B = (EditText) findViewById(R.id.editB);
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