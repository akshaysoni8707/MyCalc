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


    public WhatsappDataSetter(View currentView,WhatsappUser whatsappUser) {
        this.currentView = currentView;
        userProfile = currentView.findViewById(R.id.whatsapp_card_profile);
        userName = currentView.findViewById(R.id.whatsapp_card_heading);
        userDescription = currentView.findViewById(R.id.whatsapp_card_description);
        userTime = currentView.findViewById(R.id.whatsapp_card_time);
        userPin = currentView.findViewById(R.id.whatsapp_card_pin);
        userMute = currentView.findViewById(R.id.whatsapp_card_mute);
        userCall = currentView.findViewById(R.id.whatsapp_card_call);


        if(whatsappUser != null){
            userProfile.setImageResource(whatsappUser.getUserProfile());
            userName.setText(whatsappUser.getUserName());
            userDescription.setText(whatsappUser.getUserDescription());
            userTime.setText(whatsappUser.getUserTime());
            if(whatsappUser.isPinned()){
                userPin.setVisibility(View.VISIBLE);
            }
            if(whatsappUser.isMuted()){
                userMute.setVisibility(View.VISIBLE);
            }
        }


    }

    public View getCurrentView() {
        return this.currentView;
    }
}
