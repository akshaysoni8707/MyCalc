package com.app.mycalc;

import java.io.Serializable;

public class Employee implements Serializable {
    private String name;
    private String email;
    private String phone;
    private int age;

    public Employee(String name, String email, String phone, int age) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " " + email + " " + phone;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
