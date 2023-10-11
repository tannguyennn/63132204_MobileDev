package com.nguyentanlap.autocomplete_example;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView autoTV;
    ArrayList<String> COUNTRIES = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWidget();
        COUNTRIES.add("VietNam");
        COUNTRIES.add("United States");
        COUNTRIES.add("Canada");
        COUNTRIES.add("United Kingdom");
        COUNTRIES.add("France");
        COUNTRIES.add("Germany");
        COUNTRIES.add("Spain");
        COUNTRIES.add("Italy");
        COUNTRIES.add("Australia");

        ArrayAdapter<String> adapterCoutries = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,COUNTRIES);
        autoTV.setAdapter(adapterCoutries);
    }
    public void getWidget(){
        autoTV = findViewById(R.id.autoComplete);
    }
}