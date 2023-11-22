package com.nguyentanlap.sqllite_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class BookAddActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_add);

        int id;
        String name;
        int numPage;
        float price;
        String des;

        String sqlInsert ="INSERT INTO BOOKS VALUES("+String.valueOf(id)+",'"+name+"',"
                +String.valueOf(numPage)+","+String.valueOf(price)+",'"+des+"');
    }
}