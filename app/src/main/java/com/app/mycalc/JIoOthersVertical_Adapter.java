package com.app.mycalc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class JIoOthersVertical_Adapter extends RecyclerView.Adapter<JIoOthersVertical_Adapter.ViewHolder> {

    private Context context;
    private ArrayList<JioOthersHorizontal> othersVertical;

    public JIoOthersVertical_Adapter(Context context, ArrayList<JioOthersHorizontal> othersVertical) {
        this.context = context;
        this.othersVertical = othersVertical;
    }


    @NonNull
    @Override
    public JIoOthersVertical_Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.othersplan_card,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull JIoOthersVertical_Adapter.ViewHolder holder, int position) {
        JioOthersHorizontal verticalCard = othersVertical.get(position);
        if(verticalCard != null)
        {
            holder.textView.setText(verticalCard.getHeading());
            holder.imageView.setImageResource(verticalCard.getMyImg());
        }
    }

    @Override
    public int getItemCount() {
        return othersVertical.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textView;
        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.othersHeadingText);
            imageView = itemView.findViewById(R.id.othersImageVertical);
        }
    }
}
