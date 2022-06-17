package com.app.mycalc.ui.main;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.app.mycalc.R;

public class ChatFragment extends Fragment {

    Context context;
    public ChatFragment(Context context) {
        this.context = context;
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chat, container, false);
        TextView chatText = view.findViewById(R.id.chatText);
        chatText.setText("Chat Fragment");
        return view;
    }
}