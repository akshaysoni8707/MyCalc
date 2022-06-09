package com.app.mycalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class EmployeeListActivity extends AppCompatActivity {

    ListView employeeListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_list);

        employeeListView = findViewById(R.id.employeeListView);

        ArrayList<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Akshay", "ak@ymail.com", "123456789", 27));
        employeeList.add(new Employee("Akshay1", "ak@ymail.com", "123456789", 27));
        employeeList.add(new Employee("Akshay2", "ak@ymail.com", "123456789", 27));
        employeeList.add(new Employee("Akshay3", "ak@ymail.com", "123456789", 27));
        employeeList.add(new Employee("Akshay4", "ak@ymail.com", "123456789", 27));
        employeeList.add(new Employee("Akshay5", "ak@ymail.com", "123456789", 27));

        EmployeeListAdapter employeeListAdapter = new EmployeeListAdapter(this, 0, employeeList);
        employeeListView.setAdapter(employeeListAdapter);

    }
}