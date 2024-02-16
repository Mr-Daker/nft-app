package com.example.nft.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.nft.R;
import com.example.nft.fragments.homef;
import com.example.nft.fragments.profilef;
import com.example.nft.fragments.searchf;
import com.example.nft.fragments.statsf;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class home extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bottomNavigationView =findViewById(R.id.bottomNavigationHome);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id= item.getItemId();
                if(id==R.id.nav_home){
                    loadFrag(new homef(),false);
                }
                else if(id==R.id.nav_search){
                    loadFrag(new searchf(),false);
                }
                else if(id==R.id.nav_stats){
                    loadFrag(new statsf(),false);
                }
                else{
                    loadFrag(new profilef(),true);
                }


                return true;
            }
        });
        bottomNavigationView.setSelectedItemId(R.id.nav_home);


    }
    public void loadFrag(Fragment fragment,boolean flag){
        FragmentManager fm= getSupportFragmentManager();
        FragmentTransaction ft= fm.beginTransaction();
        if(flag=true)
            ft.add(R.id.homeContainer,fragment);
        else {
            ft.replace(R.id.homeContainer,fragment);
        }
        ft.commit();
    }
}