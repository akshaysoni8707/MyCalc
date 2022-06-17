package com.app.mycalc.ui.main;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.app.mycalc.R;

public class CallFragment extends Fragment {

    Context context;

    public CallFragment(Context context) {
        this.context = context;
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_call, container, false);
        TextView callText = view.findViewById(R.id.callText);
        callText.setText("Chat Fragment");
        return view;
    }
}