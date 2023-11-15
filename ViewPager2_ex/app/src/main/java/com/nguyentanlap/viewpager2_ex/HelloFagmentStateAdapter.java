package com.nguyentanlap.viewpager2_ex;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.List;

public class HelloFagmentStateAdapter extends FragmentStateAdapter {

    List<String> ls;

    public HelloFagmentStateAdapter(@NonNull FragmentActivity fragmentActivity, List<String> ls) {
        super(fragmentActivity);
        this.ls = ls;
    }



    @NonNull
    @Override
    public Fragment createFragment(int position) {
        String s= ls.get(position);
        return new HelloFragment(s);
    }

    @Override
    public int getItemCount() {
        return ls.size();
    }
}
