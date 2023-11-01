package com.nguyentanlap.fragments_ex1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.DisplayMetrics;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();
        int w = displayMetrics.widthPixels;
        int h = displayMetrics.heightPixels;

        if(w<h){
            Fragment1 fragment1 = new Fragment1();

            fragmentTransaction.replace(android.R.id.content,fragment1);
        }
        else{
            Fragment2 fragment2 =new Fragment2();
            fragmentTransaction.replace(android.R.id.content, fragment2);
        }

        fragmentTransaction.commit();
    }
}