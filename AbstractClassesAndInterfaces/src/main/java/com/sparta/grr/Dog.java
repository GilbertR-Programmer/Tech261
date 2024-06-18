package com.sparta.grr;

public class Dog extends Animal{

    public Dog(String name, String breed, int age) {
        super(name, breed, age);
    }

    //overloading
    //name has to be the same but we can change these things to overload
    //return type
    //type of parameters
    //order of parameters

    public void play(String name){
        System.out.println(name + " wants to play with " + super.getName());
    }
}
