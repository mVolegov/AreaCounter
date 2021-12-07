package com.areacounter.AreaCounter.models;

public class BaseAndHeight {
    private String name;
    private double base;
    private double height;

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }
}
