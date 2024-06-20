package com.sparta.grr;

public class StringExample {
    public static void main(String[] args) {
        String string1 = "Hello";
        String upperCase = string1.toUpperCase(); //Strings are Immutable which means once they're declared they can't be changed
        //you can override by redeclaring with =
        System.out.println(string1);
        System.out.println(upperCase);

        char[] arrayOfChars = string1.toCharArray();
        System.out.println();
        for(char character : arrayOfChars){
            System.out.println(character);
        }

        String valueOf = String.valueOf(100);

        //this example creates three strings in memory which can be quite innefficient
        String name = "Manish";
        System.out.println("Hello I am " + name);

        //the solutions for this are StringBuilder which essentially pretends to be a mutable string
        //StringBuffer is another solution which works like StringBuilder but threadsafe meaning multiple threads can work on 1 string



    }
}
