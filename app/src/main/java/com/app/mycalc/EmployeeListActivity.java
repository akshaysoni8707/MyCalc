package com.app.mycalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class EmployeeListActivity extends AppCompatActivity {

    ListView employeeListView;
    SearchView searchEmployee;
    EmployeeListAdapter employeeListAdapter;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_list);

        employeeListView = findViewById(R.id.employeeListView);
        searchEmployee = findViewById(R.id.searchEmployee);

        ArrayList<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Akshay", "ak@outlook.com", "1111111111", 27));
        employeeList.add(new Employee("Deep","deep@outlook.com","222222222",28));
        employeeList.add(new Employee("Raj","raj@gmail.com","3333333333",29));
        employeeList.add(new Employee("Sachin","raj@yahoo.com","4444444444",29));
        employeeList.add(new Employee("Sumit","sumit@gmail.com","5555555555",27));
        employeeList.add(new Employee("Vinay","vinay@gmail.com","6666666666",28));
        employeeList.add(new Employee("Yash","yash@gmail.com","7777777777",29));
        employeeList.add(new Employee("Zara","zera@gmail.com","8888888888",27));
        employeeList.add(new Employee("Jay","jay@hotmail.com","9999999999",28));
        employeeList.add(new Employee("Arjun","arjun@hotmail.com","0000000000",29));
        employeeList.add(new Employee("Rahul","rahul@gmail.com ","1212121212",27));
        employeeList.add(new Employee("Khayal","khayal@gmail.com","123456789",28));
        employeeList.add(new Employee("Rajesh","raj@gmail.com","789123456",29));


        employeeListAdapter = new EmployeeListAdapter(this, 0, employeeList);
        employeeListView.setAdapter(employeeListAdapter);


        searchEmployee.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
               ArrayList<Employee> filteredEmployeeList = new ArrayList<>();
                for (Employee employee : employeeList) {
//                    if (employee.getName().concat(employee.getPhone()).toLowerCase().contains(s.toLowerCase())) {
//                        filteredEmployeeList.add(employee);
//                    }

                    if (employee.toString().toLowerCase().contains(s.toLowerCase())) {
                        filteredEmployeeList.add(employee);
                    }
                }
                context = employeeListAdapter.getContext();
                employeeListAdapter = new EmployeeListAdapter(context, 0, filteredEmployeeList);
                employeeListView.setAdapter(employeeListAdapter);
                return false;
            }
        });


    }
}