package com.app.mycalc;

import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private Double salary;

    public User(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", salary=" + salary + "]";
    }
}
