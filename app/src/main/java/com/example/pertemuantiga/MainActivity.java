package com.example.pertemuantiga;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private BottomNavigationView btmNav;
    private Fragment selectedFragment = new BiodataFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btmNav = findViewById(R.id.activitymain_bottomnav);

        btmNav.setOnNavigationItemSelectedListener(this);

        loadFragment(selectedFragment);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.menu_biodata:
                selectedFragment = new BiodataFragment();
                break;

            case R.id.menu_hero:
                selectedFragment = new HeroFragment();
                break;
        }
        return loadFragment(selectedFragment);
    }

    private boolean loadFragment(Fragment selectedFragment) {
        if (selectedFragment != null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.activitymain_container,selectedFragment)
                    .commit();
            return true;
        }else{
            return false;
        }
    }
}
//public class MainActivity extends AppCompatActivity {


    //private RecyclerView rvHero;

    //@Override
    //protected void onCreate(Bundle savedInstanceState) {
        //super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        //rvHero = findViewById(R.id.activitymain_rv_hero);
        //rvHero.setHasFixedSize(true);

        //showRecyclerList();
    //}

    //private void showRecyclerList() {
        //rvHero.setLayoutManager(new LinearLayoutManager(this));

        //HeroesAdapter heroesAdapter = new HeroesAdapter(this);
        //heroesAdapter.setHeroes(HeroesData.getHeroesList());

        //rvHero.setAdapter(heroesAdapter);
    //}
