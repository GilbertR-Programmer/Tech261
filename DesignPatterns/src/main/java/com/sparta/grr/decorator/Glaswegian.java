package com.sparta.grr.decorator;

public class Glaswegian extends Pizza{

    @Override
    public String getDescription() {
        return "Fae Glasgow";
    }

    @Override
    public double getCost() {
        return 12;
    }
}
