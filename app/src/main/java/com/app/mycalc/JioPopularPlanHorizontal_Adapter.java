package com.app.mycalc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class JioPopularPlanHorizontal_Adapter extends RecyclerView.Adapter<JioPopularPlanHorizontal_Adapter.ViewHolder> {

    private Context context;
    ArrayList<JioPopularPlanHorizontal> planHorizontals;

    public JioPopularPlanHorizontal_Adapter(Context context, ArrayList<JioPopularPlanHorizontal> planHorizontals) {
        this.context = context;
        this.planHorizontals = planHorizontals;
    }


    @NonNull
    @Override
    public JioPopularPlanHorizontal_Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.popularplanhorizontal_card,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull JioPopularPlanHorizontal_Adapter.ViewHolder holder, int position) {
        JioPopularPlanHorizontal planHorizontal = planHorizontals.get(position);
        if(planHorizontal != null)
        {
            holder.badge.setText(planHorizontal.getBadge());
            holder.price.setText("₹ "+planHorizontal.getPrice());
            holder.validity.setText(planHorizontal.getValidity());
            holder.data.setText(planHorizontal.getData());
        }
    }

    @Override
    public int getItemCount() {
        return planHorizontals.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView badge, price, validity, data;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            badge = itemView.findViewById(R.id.titleHorizontal);
            price = itemView.findViewById(R.id.planRateHorizontal);
            validity = itemView.findViewById(R.id.planValidityHorizontal);
            data = itemView.findViewById(R.id.planDataHorizontal);
        }
    }
}
