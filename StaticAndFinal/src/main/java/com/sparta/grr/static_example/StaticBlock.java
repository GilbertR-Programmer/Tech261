package com.sparta.grr.static_example;

import java.util.ArrayList;

public class StaticBlock {
    private static ArrayList<String> names = new ArrayList<>();

    static { //static block will be run once when the class is loaded
        names.add("Manish");
        names.add("Alex");
    }

    public static void main(String[] args) {
        System.out.println(names);
    }
}
