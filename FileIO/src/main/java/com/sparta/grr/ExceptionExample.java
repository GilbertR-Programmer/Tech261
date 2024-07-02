package com.sparta.grr;

public class ExceptionExample {
    public static void main(String[] args) {
        printer();
    }

    private static void printer() {
        doublePrinter();
    }

    private static void doublePrinter() {
        System.out.println(1/0);
    }
}
