package com.app.mycalc;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.GenericLifecycleObserver;

import com.bumptech.glide.Glide;

public class ListAdapter extends ArrayAdapter<Person> {
    Context context;
    public ListAdapter(@NonNull Context context, int resource, @NonNull Person[] objects) {
        super(context, resource, objects);
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View currentItemView = convertView;

        if (currentItemView == null) {
            currentItemView = LayoutInflater.from(getContext()).inflate(R.layout.person_card, parent, false);
        }

        Person currentPerson = getItem(position);
        if(currentPerson != null){
            TextView userName = currentItemView.findViewById(R.id.userName);
            TextView userMessage = currentItemView.findViewById(R.id.userMessage);
            ImageView userImage = currentItemView.findViewById(R.id.userImage);
            userName.setText(currentPerson.getName());
            userMessage.setText(currentPerson.getMessage());

            LinearLayout linearLayout = currentItemView.findViewById(R.id.linearList);
            linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // do something
                    Intent intent = new Intent(context, ViewUser.class);
                    intent.putExtra("name", currentPerson.getName());
                    intent.putExtra("message", currentPerson.getMessage());
                    context.startActivity(intent);
                }
            });


            Glide.with(context).load("https://i.pravatar.cc/300").into(userImage);
        }

        return currentItemView;
    }
}
