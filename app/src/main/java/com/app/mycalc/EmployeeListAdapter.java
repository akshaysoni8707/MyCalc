package com.app.mycalc;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class EmployeeListAdapter extends ArrayAdapter<Employee> {
    Context context;

    public EmployeeListAdapter(@NonNull Context context, int resource, @NonNull List<Employee> objects) {
        super(context, resource, objects);
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View currentView = convertView;

        if (currentView == null) {
            currentView = LayoutInflater.from(getContext()).inflate(R.layout.employee_card, parent, false);
        }

        Employee employee = getItem(position);
        if (employee != null) {
            TextView userName = currentView.findViewById(R.id.EmployeeName);
            TextView userEmail = currentView.findViewById(R.id.EmployeeEmail);

            userName.setText(employee.getName());
            userEmail.setText(employee.getEmail());

            currentView.findViewById(R.id.EmployeeCard).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, EmployeeView.class);
                    intent.putExtra("myEmployee", employee);
                    context.startActivity(intent);
                }
            });
        }

        return currentView;
    }
}
