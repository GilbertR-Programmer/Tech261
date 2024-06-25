package com.sparta.grr.decorator.sides;

import com.sparta.grr.decorator.Pizza;

public abstract class Sides extends Pizza {
    protected Pizza pizza;

    public Sides(Pizza pizza) {
        this.pizza = pizza;
    }

    public abstract String getDescription();
}
