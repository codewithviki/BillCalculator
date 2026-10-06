package com.vikrant.projects.project;


public class User {
 private String name;
 private int monthalyRent;
 private int electricityUnit;
 private int patenty;
 private int waterCharges;
 private String card;

    public User(String name, int monthalyRent, int electricityUnit, int patenty, int waterCharges, String card) {
        this.name = name;
        this.monthalyRent = monthalyRent;
        this.electricityUnit = electricityUnit;
        this.patenty = patenty;
        this.waterCharges = waterCharges;
        this.card = card;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonthalyRent() {
        return monthalyRent;
    }

    public void setMonthalyRent(int monthalyRent) {
        this.monthalyRent = monthalyRent;
    }

    public int getElectricityUnit() {
        return electricityUnit;
    }

    public void setElectricityUnit(int electricityUnit) {
        this.electricityUnit = electricityUnit;
    }

    public int getPatenty() {
        return patenty;
    }

    public void setPatenty(int patenty) {
        this.patenty = patenty;
    }

    public int getWaterCharges() {
        return waterCharges;
    }

    public void setWaterCharges(int waterCharges) {
        this.waterCharges = waterCharges;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", monthalyRent=" + monthalyRent +
                ", electricityUnit=" + electricityUnit +
                ", patenty=" + patenty +
                ", waterCharges=" + waterCharges +
                ", card='" + card + '\'' +
                '}';
    }
}
