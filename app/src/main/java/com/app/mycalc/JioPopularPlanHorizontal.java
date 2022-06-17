package com.app.mycalc;

public class JioPopularPlanHorizontal {

    public String badge;
    public String price;
    public String validity;
    public String data;

    public JioPopularPlanHorizontal(String badge, String price, String validity, String data) {
        this.badge = badge;
        this.price = price;
        this.validity = validity;
        this.data = data;
    }

    public String getBadge() {
        return badge;
    }

    public void setBadge(String badge) {
        this.badge = badge;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getValidity() {
        return validity;
    }

    public void setValidity(String validity) {
        this.validity = validity;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
