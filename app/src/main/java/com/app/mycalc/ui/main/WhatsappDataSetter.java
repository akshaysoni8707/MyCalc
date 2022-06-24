package com.app.mycalc.ui.main;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.mycalc.R;

public class WhatsappDataSetter {
    View currentView;
    ImageView userProfile;
    TextView userName;
    TextView userTime;
    TextView userDescription;
    ImageView userPin;
    ImageView userMute;
    ImageView userCall;


    public WhatsappDataSetter(View currentView, WhatsappUser whatsappUser, Enum<MyTabs> tab) {
        this.currentView = currentView;
        userProfile = currentView.findViewById(R.id.whatsapp_card_profile);
        userName = currentView.findViewById(R.id.whatsapp_card_heading);
        userDescription = currentView.findViewById(R.id.whatsapp_card_description);
        userTime = currentView.findViewById(R.id.whatsapp_card_time);
        userPin = currentView.findViewById(R.id.whatsapp_card_pin);
        userMute = currentView.findViewById(R.id.whatsapp_card_mute);
        userCall = currentView.findViewById(R.id.whatsapp_card_call);

        if (whatsappUser != null) {
            userProfile.setImageResource(whatsappUser.getUserProfile());
            userName.setText(whatsappUser.getUserName());
            userDescription.setText(whatsappUser.getUserDescription());

            //chat tab
            if (tab.equals(MyTabs.CHAT)) {
                userTime.setText(whatsappUser.getUserTime());
                userCall.setVisibility(View.GONE);
                if (whatsappUser.isPinned()) {
                    userPin.setVisibility(View.VISIBLE);
                } else {
                    userPin.setVisibility(View.GONE);
                }
                if (whatsappUser.isMuted()) {
                    userMute.setVisibility(View.VISIBLE);
                } else {
                    userMute.setVisibility(View.GONE);
                }
            }
            //status tab
            else if (tab.equals(MyTabs.STATUS)) {
                userTime.setVisibility(View.GONE);
                userCall.setVisibility(View.GONE);
                userPin.setVisibility(View.GONE);
                userMute.setVisibility(View.GONE);
            }
            else {
                userTime.setVisibility(View.GONE);
                userPin.setVisibility(View.GONE);
                userMute.setVisibility(View.GONE);
                if(whatsappUser.isCalled()){
                    userCall.setVisibility(View.VISIBLE);
                }
                else{
                    userCall.setVisibility(View.GONE);
                }
            }

        }


    }

    public View getCurrentView() {
        return this.currentView;
    }
}
