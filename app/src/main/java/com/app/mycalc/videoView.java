package com.app.mycalc;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.widget.VideoView;

public class videoView extends AppCompatActivity {
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_view);
        videoView = findViewById(R.id.videoView);
//        videoView.setVideoURI(Uri.parse(Environment.getExternalStorageDirectory()+"/Download/movie.mp4"));
        videoView.setVideoPath("/Internal storage/Download/movie.mp4");
        videoView.setMediaController(new android.widget.MediaController(this));
        videoView.start();

    }
}