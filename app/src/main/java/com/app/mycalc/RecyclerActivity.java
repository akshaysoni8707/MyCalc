package com.app.mycalc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class RecyclerActivity extends AppCompatActivity {

    ArrayList<Image> images;
    RecyclerView slider;
    RecyclerView feeds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        images = new ArrayList<>();
        images.add(new Image(R.drawable.home_airtel_30082020));
        images.add(new Image(R.drawable.amazon_home_20210412));
        images.add(new Image(R.drawable.home_freecharge_20210405));
        images.add(new Image(R.drawable.home_paytm_20210519));

        slider = findViewById(R.id.slider);
        feeds = findViewById(R.id.feeds);

        slider.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        feeds.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        // has fixed size
        slider.setHasFixedSize(true);
        feeds.setHasFixedSize(true);

        SliderAdapter sliderAdapter = new SliderAdapter(this, images);
        slider.setAdapter(sliderAdapter);
        feeds.setAdapter(sliderAdapter);

    }
}