package com.app.mycalc;

public class Person {
    private String name;
    private String message;
    private String val;

    public Person(String name, String message) {
        this.name = name;
        this.message = message;
    }

    public Person(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }
}
