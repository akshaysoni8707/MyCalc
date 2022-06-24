package com.app.mycalc;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.app.mycalc.ui.main.SectionsPagerAdapter;
import com.app.mycalc.databinding.ActivityTabNavigationBinding;

public class TabNavigationActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener {

    private ActivityTabNavigationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityTabNavigationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = binding.tabs;
        tabs.setupWithViewPager(viewPager);
        tabs.addOnTabSelectedListener(this);
        FloatingActionButton fab = binding.fab;
        fab.setImageResource(R.drawable.cloud_icon);

//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        int position = tab.getPosition();
        FloatingActionButton fab = binding.fab;
        switch (position) {
            case 1:
                binding.fab.setImageResource(R.drawable.heart_empty);
                break;
            case 2:
                binding.fab.setImageResource(R.drawable.ic_qr_code_scanner);
                break;
            case 0:
            default:
                binding.fab.setImageResource(R.drawable.cloud_icon);
                break;
        }
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {
    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {
    }
}