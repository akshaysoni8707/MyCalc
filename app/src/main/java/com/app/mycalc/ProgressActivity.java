package com.app.mycalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class ProgressActivity extends AppCompatActivity {

    ProgressBar progressBar, progressBar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);

        progressBar = findViewById(R.id.progressRound);
        progressBar2 = findViewById(R.id.progressBarHorizontal);

//        progressBar2.setIndeterminate(true);

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i <= 50; i++) {
//                    progressBar.setProgress(i);
//                    try {
//                        Thread.sleep(100);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
////                progressBar.setVisibility(View.GONE);
//                Intent intent = new Intent(ProgressActivity.this, MainActivity.class);
//                startActivity(intent);
//                finish();
//            }
//        }).start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    progressBar2.setProgress(i);
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Intent intent = new Intent(ProgressActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }).start();


    }
}