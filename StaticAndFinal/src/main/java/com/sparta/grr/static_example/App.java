package com.sparta.grr.static_example;

public class App {
    public static void main(String[] args) {
        Spartan manish = new Spartan();
        Spartan alex = new Spartan();

        manish.setName("Manish");
        alex.setName("Alex");

        System.out.println(manish.getName());
        System.out.println(alex.getName());

        //we have to call from the class not the object because this is a static method
        Spartan.printSpartan(manish);

        System.out.println(manish.equals(alex));
    }
}
