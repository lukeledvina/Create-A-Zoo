package com.company.animals;

public class Penguin extends Animal {

    private String type;
    private String featherType;
    private double wingspan;


    public Penguin(String name, String location, char gender, double weight, String type, String featherType, double wingspan) {
        super(name, location, gender, weight);
        this.type = type;
        this.featherType = featherType;
        this.wingspan = wingspan;
    }



    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFeatherType() {
        return featherType;
    }

    public void setFeatherType(String featherType) {
        this.featherType = featherType;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }
}
