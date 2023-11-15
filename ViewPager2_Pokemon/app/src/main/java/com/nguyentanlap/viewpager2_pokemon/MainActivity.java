package com.nguyentanlap.viewpager2_pokemon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    PokemonRVAdapter adapter;
    ArrayList<Pokemon> lstPKM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstPKM = new ArrayList<Pokemon>();
        Pokemon p1 = new Pokemon("Pikachu",new String[]{"Điện"},"pikachu");
        Pokemon p2 = new Pokemon("Charmander", new String[]{"Lửa","Bay"},"charmander");
        Pokemon p3 = new Pokemon("Bulbasaur", new String[]{"Cỏ","Dộc"},"bulbasau");
        Pokemon p4 = new Pokemon("Squirtle", new String[]{"Nước"},"squirtle");
        lstPKM.add(p1);
        lstPKM.add(p2);
        lstPKM.add(p3);
        lstPKM.add(p4);
        ViewPager2 viewPager2 = findViewById(R.id.viewPagerPokemon);

        PokemonPageAdapter pokemonPageAdapter = new PokemonPageAdapter(this,lstPKM);
        viewPager2.setAdapter(pokemonPageAdapter);

        TabLayout tabLayout = findViewById(R.id.tabLayout);
        new TabLayoutMediator(tabLayout,viewPager2, (tab, position) -> tab.setText("Pokemon " + (position+1))).attach();
    }
}