package com.app.mycalc.ui.main;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
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
        View view = inflater.inflate(R.layout.fragment_chat, container, false);
        ListView listView = view.findViewById(R.id.whatsapp_list);
        WhatsappAdapter whatsappAdapter = new WhatsappAdapter(context,0,new WhatsappUserListCreator().getWhatsappChatList(),MyTabs.CALL);
        listView.setAdapter(whatsappAdapter);
        return view;
    }
}