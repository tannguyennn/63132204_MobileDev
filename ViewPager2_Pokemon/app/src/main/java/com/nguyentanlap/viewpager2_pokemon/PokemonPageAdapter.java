package com.nguyentanlap.viewpager2_pokemon;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.List;

public class PokemonPageAdapter extends FragmentStateAdapter {

    List<Pokemon> lstPokemon;

    public PokemonPageAdapter(@NonNull FragmentActivity fragmentActivity, List<Pokemon> lstPokemon) {
        super(fragmentActivity);
        this.lstPokemon = lstPokemon;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Pokemon p =lstPokemon.get(position);
        PokemonFragment pokemonFragment = new PokemonFragment(p);
        return pokemonFragment;
    }

    @Override
    public int getItemCount() {
        return lstPokemon.size();
    }
}
