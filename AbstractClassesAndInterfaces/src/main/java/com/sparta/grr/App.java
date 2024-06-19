package com.sparta.grr;

public class App {
    public static void main(String[] args) {
        Animal max = new Dog("Max","Terrier",7);
        Animal cindy = new Cat("Cindy","BigCat",24);

        //this is the biggest usage of abstraction, using the abstract class to group together it's children
        Animal[] animals = {max, cindy};

        max.play();
        cindy.play();
        //example of casting, this shouldn't be done 99% of the time and should instead encourage refactoring
        ((Cat) cindy).climb();
    }
}
