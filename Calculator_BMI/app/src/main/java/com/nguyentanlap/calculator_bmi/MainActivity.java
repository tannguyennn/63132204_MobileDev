package com.nguyentanlap.calculator_bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText_Weight;
    EditText editText_Height;
    TextView textView_Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWidget();
    }

    public void getWidget() {
        editText_Weight = (EditText) findViewById(R.id.editWeight);
        editText_Height = (EditText) findViewById(R.id.editHeight);
        textView_Result = (TextView) findViewById(R.id.tvResult);
    }

    public void Calculate_BMI() {
        int w = Integer.parseInt(editText_Weight.getText().toString());
        double h = Integer.parseInt(editText_Height.getText().toString());
        h = h / 100.0;

        double kQ;

        kQ = w / (h * h);
        String s;
        if (kQ < 18.5) s = "Cân nặng thấp (gầy)";
        else if (kQ < 24.9) s = "Bình thường";
        else if (kQ == 25) s = "Thừa cân";
        else if (kQ < 29.9) s = "Tiền béo phì";
        else if (kQ < 34.9) s = "Béo phì độ I";
        else s = "Béo phì độ II";

        textView_Result.setText(String.valueOf(kQ) +"\n" + s);
    }
}