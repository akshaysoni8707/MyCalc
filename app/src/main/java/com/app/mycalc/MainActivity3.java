package com.app.mycalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView tv,tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        tv = findViewById(R.id.textView5);
        tv1 = findViewById(R.id.textView6);

        Intent intent = getIntent();
        String message = intent.getStringExtra("myMessage");
        User u = (User) intent.getSerializableExtra("person");
        tv.setText(message + " " + u.getName());
        tv1.setText(u.getSalary().toString());
    }
}