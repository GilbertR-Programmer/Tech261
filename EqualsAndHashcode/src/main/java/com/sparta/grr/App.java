package com.sparta.grr;

public class App {
    public static void main(String[] args) {
        Spartan spartanOne = new Spartan("Manish","Gadhvi");
        Spartan spartanTwo = new Spartan("Manish", "Gadhvi");
        Spartan spartanThree = new Spartan("Bob", "Gadhvi");

        System.out.println(spartanOne == spartanTwo);
        System.out.println(spartanOne.equals(spartanTwo));

        System.out.println(spartanOne.hashCode());
        System.out.println(spartanTwo.hashCode());

        System.out.println(spartanOne.equals(spartanThree));
        System.out.println(spartanThree.hashCode());

        System.out.println(spartanOne.equals(null));
    }
}
