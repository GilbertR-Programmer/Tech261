package com.sparta.grr;

public class Cat extends Animal{

    public Cat(String name, String breed, int age) {
        super(name, breed, age);
    }

    @Override
    public void play() {
        System.out.println(super.getName() + " doesn't want to play");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats Cat food");
    }

}
