package com.app.mycalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class EmployeeView extends AppCompatActivity {

    TextView employeeName;
    TextView employeeEmail;
    TextView employeeNumber;
    TextView employeeAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_view);

        employeeName = findViewById(R.id.EmployeeDataName);
        employeeEmail = findViewById(R.id.EmployeeDataEmail);
        employeeNumber = findViewById(R.id.EmployeeDataNumber);
        employeeAge = findViewById(R.id.EmployeeDataAge);

        Intent intent = getIntent();
        Employee employee = (Employee) intent.getSerializableExtra("myEmployee");
        employeeName.setText(employee.getName());
        employeeEmail.setText(employee.getEmail());
        employeeAge.setText(String.valueOf(employee.getAge()));
        employeeNumber.setText(employee.getPhone());
    }
}