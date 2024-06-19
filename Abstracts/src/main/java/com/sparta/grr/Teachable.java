package com.sparta.grr;

public interface Teachable extends Educateable{
    default void train(){
        System.out.println("I am training to be teachable");
    }
}
