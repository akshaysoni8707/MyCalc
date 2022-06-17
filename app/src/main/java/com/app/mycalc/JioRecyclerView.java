package com.app.mycalc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class JioRecyclerView extends AppCompatActivity {

    RecyclerView recyclerHorizontal, popularPlanHorizontal, othersVerticalRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jio_recycler_view);

        recyclerHorizontal = findViewById(R.id.planHorizontal);
        ArrayList<JioPlanHorizontal> planHorizontal = new ArrayList<>();

        planHorizontal.add(new JioPlanHorizontal(R.drawable.plan_1));
        planHorizontal.add(new JioPlanHorizontal(R.drawable.plan_2));
        planHorizontal.add(new JioPlanHorizontal(R.drawable.plan_3));
        planHorizontal.add(new JioPlanHorizontal(R.drawable.plan_4));
        planHorizontal.add(new JioPlanHorizontal(R.drawable.plan_5));

        recyclerHorizontal.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        JioPlanHorizontal_Adapter planAdapter = new JioPlanHorizontal_Adapter(this,planHorizontal);
        recyclerHorizontal.setAdapter(planAdapter);

        popularPlanHorizontal = findViewById(R.id.popularPlanHorizontal);
        ArrayList<JioPopularPlanHorizontal> popularPlans = new ArrayList<>();

        popularPlans.add(new JioPopularPlanHorizontal("MOST RECHARGED","239","28 Days","1.5 GB/Day"));
        popularPlans.add(new JioPopularPlanHorizontal("BEST VALUE","299","28 Days","2 GB/Day"));
        popularPlans.add(new JioPopularPlanHorizontal("LIVE CRICKET WITH HOTSTAR","499","28 Days","2 GB/Day"));
        popularPlans.add(new JioPopularPlanHorizontal("MOST RECHARGED","666","84 Days","1.5 GB/Day"));
        popularPlans.add(new JioPopularPlanHorizontal("SUPER VALUE","719","84 Days","2 GB/Day"));

        popularPlanHorizontal.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        JioPopularPlanHorizontal_Adapter popularPlanAdapter = new JioPopularPlanHorizontal_Adapter(this,popularPlans);
        popularPlanHorizontal.setAdapter(popularPlanAdapter);

        othersVerticalRecycler = findViewById(R.id.othersPlanHorizontal);
        ArrayList<JioOthersHorizontal> othersHorizontals = new ArrayList<>();

        othersHorizontals.add(new JioOthersHorizontal("Play & Win",R.drawable.lucky_draw));
        othersHorizontals.add(new JioOthersHorizontal("News & Magazines",R.drawable.spin));
        othersHorizontals.add(new JioOthersHorizontal("JioEngages",R.drawable.live));

        othersVerticalRecycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));

        JIoOthersVertical_Adapter verticalAdapter = new JIoOthersVertical_Adapter(this,othersHorizontals);
        othersVerticalRecycler.setAdapter(verticalAdapter);

    }
}