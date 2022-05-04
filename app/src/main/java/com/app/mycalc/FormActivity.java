package com.app.mycalc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Pattern;

public class FormActivity extends AppCompatActivity {
    EditText userName;
    TextView userNameError;

    EditText password;
    TextView passwordError;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        userName = findViewById(R.id.personName);
        userNameError = findViewById(R.id.UserNameError);
        password = findViewById(R.id.password);
        passwordError = findViewById(R.id.passwordError);

        TextWatcher userNameTextWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String text = userName.getText().toString();
                if (text.isEmpty()) {
                    userNameError.setText(R.string.UserNameRequired);
                    userNameError.setTextColor(getColor(R.color.tomato));
                } else {
                    userNameError.setText(R.string.UserNameValid);
                    userNameError.setTextColor(getColor(R.color.teal_700));
                }
            }
        };
        userName.addTextChangedListener(userNameTextWatcher);

        TextWatcher passwordTextWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String text = password.getText().toString();
                if (text.isEmpty()) {
                    passwordError.setText(R.string.PasswordRequired);
                    passwordError.setTextColor(getColor(R.color.tomato));
                    Toast.makeText(FormActivity.this, "Password is required", Toast.LENGTH_SHORT).show();
                }
                else{
                    if(Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,10}$", text)){
                        passwordError.setText(R.string.PasswordValid);
                        passwordError.setTextColor(getColor(R.color.teal_700));
                    }else{
                        passwordError.setText(R.string.PasswordInvalid);
                        passwordError.setTextColor(getColor(R.color.tomato));
                    }
                }
            }
        };
        password.addTextChangedListener(passwordTextWatcher);
    }
}