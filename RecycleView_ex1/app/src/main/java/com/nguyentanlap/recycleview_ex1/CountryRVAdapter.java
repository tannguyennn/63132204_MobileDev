package com.nguyentanlap.recycleview_ex1;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

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
            int clickedPosition = getAdapterPosition();

            Country country = lstData.get(clickedPosition);

            Toast.makeText(view.getContext(), "You Chose" + country.getCountryName(), Toast.LENGTH_SHORT).show();

        }
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.country_item_layout, parent, false);
        CountryItemViewHolder viewHolder = new CountryItemViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        CountryItemViewHolder viewHolder = (CountryItemViewHolder) holder;
        viewHolder.position = position;
        Country country = lstData.get(position);

        ((CountryItemViewHolder) holder).countryNameV.setText(country.getCountryName());
        ((CountryItemViewHolder) holder).populationnV.setText(country.getPopulation());
        ((CountryItemViewHolder) holder).flagV.setImageResource(getMipMapResID(holder.itemView,country.getCountryFlag()));

    }

    public int getMipMapResID(View itemView, String mipmapName)
    {
        String name = itemView.getContext().getPackageName();
        return itemView.getResources().getIdentifier(mipmapName,"mipmap",name);
    }

    @Override
    public int getItemCount() {
        return lstData.size();
    }


}
