package com.app.mycalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ViewUser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_user);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String message = intent.getStringExtra("message");

        TextView nameText = findViewById(R.id.ViewUserName);
        TextView messageText = findViewById(R.id.ViewUserMessage);

        nameText.setText(name);
        messageText.setText(message);

    }
}