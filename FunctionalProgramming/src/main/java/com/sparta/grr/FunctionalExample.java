package com.sparta.grr;

import java.util.ArrayList;
import java.util.Arrays;

public class FunctionalExample {
    public static void main(String[] args) {
        //Stream lets you use functions

        ArrayList<String> names = new ArrayList<>(Arrays.asList(
                "Leo",
                "John",
                "Donny",
                "Raphael"));
        //we convert a thing into a stream, work with it and turn it back into a thing we can use

        ArrayList<String> newNames = new ArrayList<>();
        names.stream()
                .map(String::toUpperCase)
                .peek(System.out::println)
                .filter(name -> name.contains("O"))//because this has a param we can't make it a method reference
                .forEach(newNames::add);

        System.out.println(newNames.get(2));
        System.out.println(newNames.size());

        //need to know consumer,function,predicate,supplier

    }
}
