package com.app.mycalc.ui.main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.app.mycalc.R;

import java.util.List;

public class WhatsappAdapter extends ArrayAdapter<WhatsappUser> {
    Context context;
    Enum<MyTabs> tab;
    public WhatsappAdapter(@NonNull Context context, int resource, @NonNull List<WhatsappUser> objects, Enum<MyTabs> tab) {
        super(context, resource, objects);
        this.context = context;
        this.tab = tab;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View currentView = convertView;

        if (currentView == null){
            currentView = LayoutInflater.from(getContext()).inflate(R.layout.whatsapp_card,parent,false);
        }

        WhatsappUser whatsappUser = getItem(position);
        WhatsappDataSetter dataSetter = new WhatsappDataSetter(currentView,whatsappUser,tab);
        currentView = dataSetter.getCurrentView();

        return currentView;
    }
}
