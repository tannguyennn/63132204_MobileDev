package com.nguyentanlap.n63132204_thigiuaky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomDongVatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_dong_vat);

        Intent intentTuLogin = getIntent();

        ImageView img_item_anh = (ImageView) findViewById(R.id.imgitemAnh);
        TextView tv_item_ten = (TextView) findViewById(R.id.tvitemTen);
        TextView tv_item_taptinh = (TextView) findViewById(R.id.tvitemTapTinh);
        TextView tv_item_sl = (TextView) findViewById(R.id.tvitemSl);

        //img_item_anh.setImageResource(intentTuLogin.getStringExtra("anh"));
        tv_item_ten.setText(intentTuLogin.getStringExtra("ten"));
        tv_item_taptinh.setText("Động vật "+ intentTuLogin.getStringExtra("taptinh"));
        tv_item_ten.setText("Số lượng loài "+ intentTuLogin.getStringExtra("soluong"));
    }
}