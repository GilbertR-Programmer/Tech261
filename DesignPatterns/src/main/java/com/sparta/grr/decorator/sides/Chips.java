package com.sparta.grr.decorator.sides;

import com.sparta.grr.decorator.Pizza;

public class Chips extends Sides{
    public Chips(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 13;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " and chips";
    }
}
