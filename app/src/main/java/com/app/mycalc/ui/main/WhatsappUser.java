package com.app.mycalc.ui.main;

public class WhatsappUser {
    private int userProfile;
    private String userName;
    private String userDescription;
    private String userTime;
    private boolean isMuted;
    private boolean isPinned;
    private boolean isCalled;


    public WhatsappUser() {
    }

    public WhatsappUser(int userProfile, String userName, String userDescription, String userTime, boolean isMuted, boolean isPinned, boolean isCalled) {
        this.userProfile = userProfile;
        this.userName = userName;
        this.userDescription = userDescription;
        this.userTime = userTime;
        this.isMuted = isMuted;
        this.isPinned = isPinned;
        this.isCalled = isCalled;
    }

    public int getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(int userProfile) {
        this.userProfile = userProfile;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserDescription() {
        return userDescription;
    }

    public void setUserDescription(String userDescription) {
        this.userDescription = userDescription;
    }

    public String getUserTime() {
        return userTime;
    }

    public void setUserTime(String userTime) {
        this.userTime = userTime;
    }

    public boolean isMuted() {
        return isMuted;
    }

    public void setMuted(boolean muted) {
        isMuted = muted;
    }

    public boolean isPinned() {
        return isPinned;
    }

    public void setPinned(boolean pinned) {
        isPinned = pinned;
    }

    public boolean isCalled() {
        return isCalled;
    }

    public void setCalled(boolean called) {
        isCalled = called;
    }
}
