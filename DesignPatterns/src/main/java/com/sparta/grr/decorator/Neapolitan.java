package com.sparta.grr.decorator;

public class Neapolitan extends Pizza{

    @Override
    public String getDescription() {
        return "De Naples";
    }

    @Override
    public double getCost() {
        return 34;
    }
}
