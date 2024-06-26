package com.sparta.grr;

//some typical convention
//T - Type
//V - Value
//K,V - Key, Value
//E - Element

public class DoubleRectangle {
    private Double width;
    private Double height;

    public DoubleRectangle(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public static <V> void printToConsole(V value){
        System.out.println("Rectangle Area: " + value);
    }
}
