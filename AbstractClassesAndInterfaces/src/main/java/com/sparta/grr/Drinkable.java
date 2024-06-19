package com.sparta.grr;

public interface Drinkable extends Sleepable {
    //every interface method is automatically public and abstract so they keywords are unneeded
    void drink();

    public static final int max = 10; //a variable defined in an interface is constant

    default void print(){
        printFromInterface();
    }

    private static void printFromInterface(){
        System.out.println("I am printing from an interface");
    }

    public static void doStuff(){
        System.out.println("DoStuff");
    }

}
