package com.nguyentanlap.sqllite_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BookNaviActivity extends AppCompatActivity {
    SQLiteDatabase bookBD;
    Cursor csPointToRecord;
    Button btnF;
    Button btnL;
    Button btnN;
    Button btnP;
    TextView tvBookId;
    TextView tvBookName;
    TextView tvBookPage;
    TextView tvBookPrice;
    TextView tvBookDes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_navi);
        bookBD = openOrCreateDatabase("book.db",MODE_PRIVATE,null);
        csPointToRecord = bookBD.rawQuery("SELECT * FROM BOOKS", null);
        csPointToRecord.moveToFirst();
        getWidget();

        btnF.setOnClickListener(xulyFirst);
        btnL.setOnClickListener(xulyLast);
        btnN.setOnClickListener(xulyNext);
        btnP.setOnClickListener(xulyPrevious);

    }

    View.OnClickListener xulyFirst = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            csPointToRecord.moveToFirst();
            capnhatView();
        }
    };

    View.OnClickListener xulyLast = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            csPointToRecord.moveToLast();
            capnhatView();
        }
    };

    View.OnClickListener xulyNext = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            csPointToRecord.moveToNext();
            capnhatView();
        }
    };

    View.OnClickListener xulyPrevious = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            csPointToRecord.moveToPrevious();
            capnhatView();
        }
    };

    void getWidget(){
        btnF = findViewById(R.id.btnBookFirst);
        btnL = findViewById(R.id.btnBookLast);
        btnN = findViewById(R.id.btnBookNext);
        btnP = findViewById(R.id.btnBookPrevious);
        tvBookId = findViewById(R.id.tvBookId);
        tvBookName = findViewById(R.id.tvBookName);
        tvBookPrice = findViewById(R.id.tvBookPrice);
        tvBookPage = findViewById(R.id.tvBookPage);
        tvBookDes = findViewById(R.id.tvBookDes);
    }
    public void capnhatView()
    {
        int id = csPointToRecord.getInt(0);
        String name = csPointToRecord.getString(1);
        int numPage = csPointToRecord.getInt(2);
        float price = csPointToRecord.getInt(3);
        String description = csPointToRecord.getString(4);

        tvBookId.setText(String.valueOf(id));
        tvBookName.setText(name);
        tvBookPrice.setText(String.valueOf(price));
        tvBookPage.setText(String.valueOf(numPage));
        tvBookDes.setText(description);


    }
}