package com.sparta.grr;

public interface Educateable {
    void study();
    default void train(){
        System.out.println("I am Educateable");
    }
}
