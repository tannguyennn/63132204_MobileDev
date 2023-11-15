package com.nguyentanlap.viewpager2_pokemon;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class PokemonFragment extends Fragment {

    private Pokemon data;

    public PokemonFragment(Pokemon pokemon) {
        // Required empty public constructor
        data = pokemon;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pokemon, container, false);
        TextView textViewTenQG = view.findViewById(R.id.textViewPokemonName);
        TextView textViewDanSo = view.findViewById(R.id.textViewHe);
        ImageView imageViewFlag = view.findViewById(R.id.imageViewPoke);

        textViewTenQG.setText(data.getNamePokemon());
        textViewDanSo.setText("Population: " + String.valueOf(data.getLstHe()));

        int resID = view.getResources().getIdentifier(data.getPokemonImage(), "mipmap", view.getContext().getPackageName());
        imageViewFlag.setImageResource(resID);
        // Inflate the layout for this fragment
        return view;
    }

}