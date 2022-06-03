package com.app.mycalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        listView = findViewById(R.id.listings);
//        ArrayAdapter<String> arr;
//        arr = new ArrayAdapter<String>(
//                this,
//                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,
//                getResources().getStringArray(R.array.Languages));
//        listView.setAdapter(arr);

        Person[] personList = new Person[5];
        for (int i = 0; i < personList.length; i++) {
            personList[i] = new Person("Person " + (i+1), (i+1) + " Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has");
        }

        ListAdapter arr = new ListAdapter(this, 0, personList);
        listView.setAdapter(arr);

    }
}