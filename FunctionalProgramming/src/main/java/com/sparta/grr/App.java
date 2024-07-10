package com.sparta.grr;

public class App {
    public static void main(String[] args) {
        SwitchOnable switchOnable = () -> System.out.println("yolo");
        //this is a lambda expression it passes needed params and runs the method body
        //it is essentially a function

        OnSwitch newSwitchOnble = new OnSwitch() {
            @Override
            void switchOn() {
                System.out.println("I am the one son");
            }
        };


        //return statement


        switchOnable.switchOn();
        System.out.println(switchOnable.getClass());

        newSwitchOnble.switchOn();
        System.out.println(newSwitchOnble.getClass());
    }
}
