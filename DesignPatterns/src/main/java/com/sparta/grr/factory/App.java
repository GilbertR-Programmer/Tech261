package com.sparta.grr.factory;

public class App {
    public static void main(String[] args) {
        Speakable cat = AnimalFactory.getAnimal("Cat");

        System.out.println(cat.speak());

    }
}
