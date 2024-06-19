package com.sparta.grr;

public interface Trainable extends Educateable {
    void study();

    default void train(){
        System.out.println("I am training to be trainable");
    }
}