package com.app.mycalc.ui.main;

import com.app.mycalc.R;

import java.util.ArrayList;

public class WhatsappUserListCreator {
    ArrayList<WhatsappUser> whatsappChatList;

    public WhatsappUserListCreator() {
        whatsappChatList = new ArrayList<>();

        whatsappChatList.add(new WhatsappUser(R.drawable.man1, "Akshay Soni", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.", "12:56", true, false, true));
        whatsappChatList.add(new WhatsappUser(R.drawable.man1, "Sumit", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.", "12:56", false, true, false));
        whatsappChatList.add(new WhatsappUser(R.drawable.man1, "Deep", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.", "12:56", false, false, true));
        whatsappChatList.add(new WhatsappUser(R.drawable.man1, "Daxesh", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.", "12:56", true, true, false));
        whatsappChatList.add(new WhatsappUser(R.drawable.man1, "Jay", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.", "12:56", true, false, false));
        whatsappChatList.add(new WhatsappUser(R.drawable.man1, "Akshay Soni", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.", "12:56", true, false, false));
        whatsappChatList.add(new WhatsappUser(R.drawable.man1, "Sumit", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.", "12:56", false, true, false));
        whatsappChatList.add(new WhatsappUser(R.drawable.man1, "Deep", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.", "12:56", false, false, false));
        whatsappChatList.add(new WhatsappUser(R.drawable.man1, "Daxesh", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.", "12:56", true, true, false));
        whatsappChatList.add(new WhatsappUser(R.drawable.man1, "Jay", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.", "12:56", true, false, false));
        whatsappChatList.add(new WhatsappUser(R.drawable.man1, "Akshay Soni", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.", "12:56", true, false, false));
        whatsappChatList.add(new WhatsappUser(R.drawable.man1, "Sumit", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.", "12:56", false, true, false));
        whatsappChatList.add(new WhatsappUser(R.drawable.man1, "Deep", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.", "12:56", false, false, false));
        whatsappChatList.add(new WhatsappUser(R.drawable.man1, "Daxesh", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.", "12:56", true, true, false));
        whatsappChatList.add(new WhatsappUser(R.drawable.man1, "Jay", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.", "12:56", true, false, false));
    }

    public ArrayList<WhatsappUser> getWhatsappChatList() {
        return whatsappChatList;
    }
}
