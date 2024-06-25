package com.sparta.grr.decorator;

import com.sparta.grr.decorator.sides.Chips;
import com.sparta.grr.decorator.sides.Salad;

public class App {
    public static void main(String[] args) {
        Glaswegian glaswegian = new Glaswegian();
        System.out.println(glaswegian.getDescription() + " Cost: " + glaswegian.getCost());

        Salad salad = new Salad(glaswegian);
        System.out.println(salad.getDescription() + " Cost: " + salad.getCost());

        Chips chips = new Chips(salad);
        System.out.println(chips.getDescription() + " Cost: " + chips.getCost());

        Chips chips2 = new Chips(new Neapolitan());
        System.out.println(chips2.getDescription() + " Cost: " + chips2.getCost());



    }
}
