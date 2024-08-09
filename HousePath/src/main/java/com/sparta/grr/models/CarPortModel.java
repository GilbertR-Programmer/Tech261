package com.sparta.grr.models;

public class CarPortModel {

    DimensionValue width,length;
    static final private double MAX_WIDTH = 7.2;
    static final private double MIN_WIDTH = 0;
    static final private double MAX_LENGTH = 7.2;
    static final private double MIN_LENGTH = 1;

    CarPortModel(double width, double length) {
        this.width = new DimensionValue(MAX_WIDTH,MIN_WIDTH);
        this.length = new DimensionValue(MAX_LENGTH,MIN_LENGTH);
        this.width.setCurrent(width);
        this.length.setCurrent(length);
    }

    public double getWidth() {
        return width.getCurrent();
    }

    public double getLength() {
        return length.getCurrent();
    }

    public void setWidth(double width) {
        this.width.setCurrent(width);
    }

    public void setLength(double length) {
        this.length.setCurrent(length);
    }
}
