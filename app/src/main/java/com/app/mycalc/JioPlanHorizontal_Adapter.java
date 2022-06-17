package com.app.mycalc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class JioPlanHorizontal_Adapter extends RecyclerView.Adapter<JioPlanHorizontal_Adapter.ViewHolder> {
    private Context context;
    private ArrayList<JioPlanHorizontal> listHorizontal;

public JioPlanHorizontal_Adapter(Context context, ArrayList<JioPlanHorizontal> listHorizontal) {
        this.context = context;
        this.listHorizontal = listHorizontal;
    }

    @NonNull
    @Override
    public JioPlanHorizontal_Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.planhorizontal_card,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull JioPlanHorizontal_Adapter.ViewHolder holder, int position) {
        JioPlanHorizontal planHorizontal = listHorizontal.get(position);
        if(planHorizontal != null)
        {
            holder.imageHorizontal.setImageResource(planHorizontal.getMyImage());
        }
    }

    @Override
    public int getItemCount() {
        return listHorizontal.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

    ImageView imageHorizontal;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageHorizontal = itemView.findViewById(R.id.jioPlanImage);
        }
    }
}
