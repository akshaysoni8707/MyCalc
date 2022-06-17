package com.app.mycalc.ui.main;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.app.mycalc.R;

public class StatusFragment extends Fragment {

    Context context;

    public StatusFragment(Context context) {
        this.context = context;
        // Required empty public constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_status, container, false);
        TextView statusText = view.findViewById(R.id.statusText);
        statusText.setText("Chat Fragment");
        return view;
    }
}