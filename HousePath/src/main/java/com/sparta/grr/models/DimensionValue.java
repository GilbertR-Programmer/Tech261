package com.sparta.grr.models;

public class DimensionValue{

    double current;
    double max;
    double min;

    public DimensionValue(double max, double min) {
        this.current = min;
        this.max = max;
        this.min = min;
    }


    public double getCurrent() {
        return current;
    }

    public void setCurrent(double current) {
        if(current > max){
            current = max;
        }else if(current < min){
            current = min;
        }
        this.current = current;
    }

    public double getMax() {
        return max;
    }

    public double getMin() {
        return min;
    }
}
