package com.nguyentanlap.recycleview_ex1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CountryRVAdapter extends RecyclerView.Adapter {

    List<Country> lstData;

    public CountryRVAdapter(List<Country> lstData) {
        this.lstData = lstData;
    }

    public final class CountryItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        ImageView flagV;
        TextView countryNameV;
        TextView populationnV;
        public int position;

        public CountryItemViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            flagV = (ImageView) itemView.findViewById(R.id.imageViewFlag);
            countryNameV = (TextView) itemView.findViewById(R.id.textViewCountryName);
            populationnV = (TextView) itemView.findViewById(R.id.textViewPopulation);
        }

        @Override
        public void onClick(View view) {
            int clickedPosition

        }
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


}
