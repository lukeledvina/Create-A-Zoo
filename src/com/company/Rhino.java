package com.company;

public class Rhino extends Animal {

     private boolean isEndangered;
     private double hornSize;
     private String type;


    public Rhino(String name, String location, char gender, double weight, String type) {
        super(name, location, gender, weight);
        this.type = type;

    }

    public boolean isEndangered() {
        return isEndangered;
    }

    public void setEndangered(boolean endangered) {
        isEndangered = endangered;
    }

    public double getHornSize() {
        return hornSize;
    }

    public void setHornSize(double hornSize) {
        this.hornSize = hornSize;
    }

    public String getType() {
        return type;
    }


}


