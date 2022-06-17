package com.example.bottomnavigationviewsampleapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.text.Layout;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    FirstFragment fragment1;
    SecondFragment fragment2;
    ThirdFragment fragment3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final FragmentManager fragmentManager = getSupportFragmentManager();

        bottomNavigationView = findViewById(R.id.bottom_navigation);

        // define your fragments here
          fragment1 = new FirstFragment();
          fragment2 = new SecondFragment(this);
          fragment3 = new ThirdFragment();

        // handle navigation selection
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment;
                switch (item.getItemId()) {
                    case R.id.action_favorites:
                        fragment = fragment1;
                        break;
                    case R.id.action_schedules:
                        fragment = fragment2;
                        break;
                    case R.id.action_music:
                    default:
                        fragment = fragment3;
                        break;
                }
                fragmentManager.beginTransaction().replace(R.id.rlContainer, fragment).commit();
                return true;
            }
        });
        // Set default selection
        bottomNavigationView.setSelectedItemId(R.id.action_favorites);
    }
}