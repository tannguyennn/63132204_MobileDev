package com.nguyentanlap.intent_ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText edtUserName;
    EditText edtPassWord;
    Button btnXacNhan;

    void getWid(){
        edtUserName = (EditText) findViewById(R.id.edtUserName);
        edtPassWord =(EditText) findViewById(R.id.edtPass);
        btnXacNhan = (Button) findViewById(R.id.btnOK);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getWid();

        btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String tenDN = edtUserName.getText().toString();
                String matKhau = edtPassWord.getText().toString();

                if(tenDN.equals("nguyentanlap") && matKhau.equals("123")){
                    Intent iQuiz = new Intent(LoginActivity.this, HomeActivity.class);
                    iQuiz.putExtra("tenDN",tenDN);
                    iQuiz.putExtra("mk",matKhau);
                    startActivity(iQuiz);

                }
                else{
                    Toast.makeText(LoginActivity.this,"BẠN NHẬP SAI THÔNG TIN",Toast.LENGTH_LONG).show();
                }
            }
        });

    }


}