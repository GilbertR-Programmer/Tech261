package com.sparta.grr.models;

public class HouseModel{

    DimensionValue width,height,length;
    CarPortModel carPort;
    static final private double MAX_HEIGHT = 8;
    static final private double MIN_HEIGHT = 1;
    static final private double MAX_WIDTH = 8;
    static final private double MIN_WIDTH = 1;
    static final private double MAX_LENGTH = 8;
    static final private double MIN_LENGTH = 1;

    HouseModel(double height, double width, double length) {
        this.width = new DimensionValue(MAX_WIDTH,MIN_WIDTH);
        this.height = new DimensionValue(MAX_HEIGHT,MIN_HEIGHT);
        this.length = new DimensionValue(MAX_LENGTH,MIN_LENGTH);
        this.carPort = new CarPortModel(0,0);
        this.width.setCurrent(width);
        this.height.setCurrent(height);
        this.length.setCurrent(length);
    }

    public CarPortModel getCarPort() {
        return carPort;
    }

    public void setCarPort(CarPortModel carPort) {
        this.carPort = carPort;
    }

    public double getWidth() {
        return width.getCurrent();
    }

    public void setWidth(double width) {
        this.width.setCurrent(width);
    }

    public double getHeight() {
        return height.getCurrent();
    }

    public void setHeight(double height) {
        this.height.setCurrent(height);
    }

    public double getLength() {
        return length.getCurrent();
    }

    public void setLength(double length) {
        this.length.setCurrent(length);
    }
}
