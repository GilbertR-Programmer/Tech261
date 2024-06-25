package com.sparta.grr.factory;

public class AnimalFactory {

    public static Speakable getAnimal(String animal) {
        return switch (animal) {
            case "Dog" -> new Dog();
            case "Hound Dog" -> new Dog("Hound Dog");
            case "Cat" -> new Cat();
            case "Fish" -> new Fish();
            default -> null;
        };
    }
}
