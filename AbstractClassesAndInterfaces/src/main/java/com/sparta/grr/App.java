package com.sparta.grr;

public class App {
    public static void main(String[] args) {
        Dog max = new Dog("Max","Terrier",7);
        Cat cindy = new Cat("Cindy","BigCat",24);

        max.play();
        cindy.play();
    }
}
