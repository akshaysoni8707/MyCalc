package com.app.mycalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

public class FormActivity2 extends AppCompatActivity {

    RadioGroup genderRadioGroup;
    RadioButton maleRadioButton, femaleRadioButton;
    CheckBox dancingCheckBox, codingCheckBox;
    ChipGroup chipGroup;
    Chip upiChip;
    ToggleButton toggleButton;
    Switch switchButton;
    ImageButton imageButton;

    View.OnClickListener onClickListener1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(FormActivity2.this, "Hello Java", Toast.LENGTH_SHORT).show();
        }
    };

    View.OnClickListener onClickListener2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(FormActivity2.this, "Hello Kotlin", Toast.LENGTH_SHORT).show();
        }
    };

    View.OnClickListener toggleListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (toggleButton.isChecked()) {
                imageButton.setOnClickListener(onClickListener1);
            } else {
                imageButton.setOnClickListener(onClickListener2);
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form2);


        genderRadioGroup = findViewById(R.id.genderRadioGroup);
        maleRadioButton = findViewById(R.id.maleRadioButton);
        femaleRadioButton = findViewById(R.id.femaleRadioButton);
        dancingCheckBox = findViewById(R.id.dancingCheckBox);
        codingCheckBox = findViewById(R.id.codingCheckBox);
        chipGroup = findViewById(R.id.chipGroup);
        upiChip = findViewById(R.id.upiChip);
        toggleButton = findViewById(R.id.toggleButton2);
        switchButton = findViewById(R.id.switch1);
        imageButton = findViewById(R.id.imageButton);

        //radio button listener
        genderRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.maleRadioButton) {
                    maleRadioButton.setChecked(true);
                    Toast.makeText(FormActivity2.this, "Male", Toast.LENGTH_LONG).show();
                } else if (checkedId == R.id.femaleRadioButton) {
                    femaleRadioButton.setChecked(true);
                    Toast.makeText(FormActivity2.this, "Female", Toast.LENGTH_LONG).show();
                }
            }
        });

        //checkbox listener
        dancingCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    Toast.makeText(FormActivity2.this, "Dancing", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(FormActivity2.this, "Not Dancing", Toast.LENGTH_LONG).show();
                }
            }
        });
        codingCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    Toast.makeText(FormActivity2.this, "Coding", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(FormActivity2.this, "Not Coding", Toast.LENGTH_LONG).show();
                }
            }
        });

        //chip group listener
        upiChip.setOnCloseIconClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                upiChip.setVisibility(View.GONE);
                switchButton.setChecked(false);
            }
        });

        //toggle button listener
        toggleButton.setOnClickListener(toggleListener);
        imageButton.setOnClickListener(onClickListener2);


        //switch button listener
        switchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    upiChip.setVisibility(View.VISIBLE);
                }
                else{
                    upiChip.setVisibility(View.GONE);
                }
            }
        });
    }
}