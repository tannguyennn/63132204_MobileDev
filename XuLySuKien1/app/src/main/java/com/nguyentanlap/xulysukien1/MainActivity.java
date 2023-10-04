package com.nguyentanlap.xulysukien1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText_UN;
    EditText editText_PWD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //B tim dieu khien
        editText_UN = findViewById(R.id.editUsername);
        editText_PWD = findViewById(R.id.editPassword);
    }

    //ten DN = 63CLC1 pass= 123
    public void Login_Click(View v){
        //B1 lay du lieu

        String tenDN = editText_UN.getText().toString();
        String mk = editText_PWD.getText().toString();

        //B2 xu ly
        String ketQua;
        if(tenDN.equals("63CLC1") && mk.equals("123"))
            ketQua="OK, login success";
        else ketQua =" not OK, login failed";

        //B3 xuat ket qua
        Toast.makeText(this,ketQua,Toast.LENGTH_LONG).show();
    }
}