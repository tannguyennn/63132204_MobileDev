package com.nguyentanlap.sqllite_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    SQLiteDatabase bookDB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        bookDB = openOrCreateDatabase("book.db",MODE_PRIVATE,null);
//
//        String sqltext = "DROP TABLE IF EXISTS BOOKS";
//        String sqltaobang = "CREATE TABLE BOOKS(BookID integer PRIMARY KEY, BookName text,\n" +
//                "Page integer, Price Float, Description text)";
//
//        bookDB.execSQL(sqltext);
//        bookDB.execSQL(sqltaobang);
//
//        bookDB.close();

        Button btnBN;
        btnBN = findViewById(R.id.btnBooknavi);

        btnBN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BookNaviActivity.class);
                startActivity(intent);
            }
        });
    }
}