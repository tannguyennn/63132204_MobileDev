package com.nguyentanlap.viewpager2_pokemon;

import java.util.List;

public class Pokemon {
    private String namePokemon;
    private List<String> lstHe;
    private String pokemonImage;

    public Pokemon(String namePokemon, String[] lstHe, String pokemonImage) {
        this.namePokemon = namePokemon;
        this.lstHe = lstHe;
        this.pokemonImage = pokemonImage;
    }

    public String getNamePokemon() {
        return namePokemon;
    }

    public void setNamePokemon(String namePokemon) {
        this.namePokemon = namePokemon;
    }

    public List<String> getLstHe() {
        return lstHe;
    }

    public void setLstHe(List<String> lstHe) {
        this.lstHe = lstHe;
    }

    public String getPokemonImage() {
        return pokemonImage;
    }

    public void setPokemonImage(String pokemonImage) {
        this.pokemonImage = pokemonImage;
    }
}
