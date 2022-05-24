package com.app.mycalc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;

import java.util.regex.Pattern;

public class FormActivity extends AppCompatActivity {
    EditText userName;
    TextView userNameError;

    EditText password;
    TextView passwordError;

    CheckedTextView checkedTextView;

    EditText dateField;
    MaterialDatePicker materialDatePicker;

    AutoCompleteTextView selectState;
    String[] states = {
            "Andhra Pradesh",
            "Arunachal Pradesh",
            "Assam",
            "Bihar",
            "Chhattisgarh",
            "Goa",
            "Gujarat",
            "Haryana",
            "Himachal Pradesh",
            "Jammu and Kashmir",
            "Jharkhand",
            "Karnataka",
            "Kerala",
            "Madhya Pradesh",
            "Maharashtra",
            "Manipur",
            "Meghalaya",
            "Mizoram",
            "Nagaland",
            "Odisha",
            "Punjab",
            "Rajasthan",
            "Sikkim",
            "Tamil Nadu",
            "Telangana",
            "Tripura",
            "Uttarakhand",
            "Uttar Pradesh",
            "West Bengal"
    };

    MultiAutoCompleteTextView selectCities;
    String[] cities = {
            "Bangalore",
            "Chennai",
            "Delhi",
            "Hyderabad",
            "Kolkata",
            "Mumbai",
            "Pune",
            "Ahmedabad",
            "Aurangabad",
            "Bangalore",
            "Belgaum",
            "Bhubaneswar",
            "Chandigarh",
            "Cochin",
            "Coimbatore",
            "Cuttack",
            "Dehradun",
            "Dhanbad",
            "Gandhinagar",
            "Gurgaon",
            "Guwahati",
            "Hubli",
            "Indore",
            "Jabalpur",
            "Jaipur",
            "Jalandhar",
            "Jammu",
            "Jamshedpur",
            "Jhansi",
            "Kakinada",
            "Kochi",
            "Kolkata",
            "Lucknow",
            "Ludhiana",
            "Madurai",
            "Mangalore",
            "Meerut",
            "Nagpur",
            "Nashik",
            "Noida",
            "Patna",
            "Pimpri-Chinchwad",
            "Pune",
            "Raipur",
            "Rajkot",
            "Ranchi",
            "Surat",
            "Thiruvananthapuram",
            "Thrissur",
            "Tiruchirappalli",
            "Tirunelveli",
            "Tiruppur",
            "Ujjain",
            "Vadodara",
            "Vijayawada",
            "Visakhapatnam",
            "Warangal"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        userName = findViewById(R.id.personName);
        userNameError = findViewById(R.id.UserNameError);
        password = findViewById(R.id.password);
        passwordError = findViewById(R.id.passwordError);
        selectState = findViewById(R.id.selectState);
        selectCities = findViewById(R.id.selectCities);
        checkedTextView = findViewById(R.id.checkedTextView);
        dateField = findViewById(R.id.Date);

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
                } else {
                    if (Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,10}$", text)) {
                        passwordError.setText(R.string.PasswordValid);
                        passwordError.setTextColor(getColor(R.color.teal_700));
                    } else {
                        passwordError.setText(R.string.PasswordInvalid);
                        passwordError.setTextColor(getColor(R.color.tomato));
                    }
                }
            }
        };
        password.addTextChangedListener(passwordTextWatcher);

        selectState.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, states));

        selectState.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(FormActivity.this, "You selected " + states[i], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(FormActivity.this, "Please select a state", Toast.LENGTH_SHORT).show();
            }
        });

        selectCities.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, cities));
        selectCities.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
        selectCities.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(FormActivity.this, "You selected " + cities[i], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(FormActivity.this, "Please select a city", Toast.LENGTH_SHORT).show();
            }
        });

        checkedTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkedTextView.isChecked()) {
                    checkedTextView.setChecked(false);
                    checkedTextView.setText("This is alternative check = true");
                    checkedTextView.setCheckMarkDrawable(android.R.drawable.btn_star_big_on);
                } else {
                    checkedTextView.setChecked(true);
                    checkedTextView.setText("This is alternative check = false");
                    checkedTextView.setCheckMarkDrawable(android.R.drawable.btn_star_big_off);
                }
            }
        });

        dateField.setShowSoftInputOnFocus(false);
        dateField.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                materialDatePicker =
                        MaterialDatePicker.Builder.datePicker()
                                .setTitleText("Select date")
                                .build();
                materialDatePicker.show(getSupportFragmentManager(), "DATE_PICKER");
                materialDatePicker.addOnPositiveButtonClickListener(new MaterialPickerOnPositiveButtonClickListener() {
                    @Override
                    public void onPositiveButtonClick(Object selection) {
                            dateField.setText(materialDatePicker.getHeaderText());
                    }
                });
            }
        });
    }
}