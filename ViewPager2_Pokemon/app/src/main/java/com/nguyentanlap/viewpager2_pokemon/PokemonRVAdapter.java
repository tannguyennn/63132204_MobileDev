package com.nguyentanlap.viewpager2_pokemon;


import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PokemonRVAdapter extends RecyclerView.Adapter {

    List<Pokemon> lstPokemon;
    public PokemonRVAdapter(List<Pokemon> lstPokemon) {
        this.lstPokemon = lstPokemon;
    }

    public final class PokemonItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView tvName;
        TextView tvHe;
        ImageView imgPoke;
        public int position;

        public PokemonItemViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            tvName = itemView.findViewById(R.id.textViewPokemonName);
            tvHe = itemView.findViewById(R.id.textViewHe);
            imgPoke = itemView.findViewById(R.id.imageViewPoke);
        }

        @Override
        public void onClick(View view) {
            int clicked = getAdapterPosition();
            Pokemon pokemon = lstPokemon.get(position);
            Toast.makeText(view.getContext(),"Click " + pokemon.getNamePokemon(),Toast.LENGTH_LONG).show();
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.pokemon_item_layout,parent,false);
        PokemonItemViewHolder pokemonItemViewHolder = new PokemonItemViewHolder(v);
        return pokemonItemViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        PokemonItemViewHolder viewHolder = (PokemonItemViewHolder) holder;
        viewHolder.position = position;

        Pokemon pokemon = lstPokemon.get(position);

        ((PokemonItemViewHolder) holder).tvName.setText(pokemon.getNamePokemon());
        ((PokemonItemViewHolder) holder).tvHe.setText(pokemon.getLstHe().toString());
        ((PokemonItemViewHolder) holder).imgPoke.setImageResource(getMipmapResId(holder.itemView,pokemon.getPokemonImage()));

    }

    private int getMipmapResId(View itemView, String mipmapName) {
        String packageName = itemView.getContext().getPackageName();
        return itemView.getResources().getIdentifier(mipmapName, "mipmap", packageName);
    }

    @Override
    public int getItemCount() {
        return lstPokemon.size();
    }
}
