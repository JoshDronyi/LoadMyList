package com.example.loadmylist.model;

import java.util.Date;

 public class Animal {
    private String name;
    private String type;
    private int legCount;
    private boolean isAdult;
    private Date dateOfAdoption;

    public Animal(String name, String type, int legCount, boolean isAdult, Date dateOfAdoption) {
        this.name = name;
        this.type = type;
        this.legCount = legCount;
        this.isAdult = isAdult;
        this.dateOfAdoption = dateOfAdoption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLegCount() {
        return legCount;
    }

    public void setLegCount(int legCount) {
        this.legCount = legCount;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }

    public Date getDateOfAdoption() {
        return dateOfAdoption;
    }

    public void setDateOfAdoption(Date dateOfAdoption) {
        this.dateOfAdoption = dateOfAdoption;
    }
}
