package com.sparta.grr;

public class FizzBuzz {
    public static String getFizzBuzzOf(int number){
        if(number % 3 == 0){
            if(number % 5 == 0){
                return "FizzBuzz";
            } else {
                return "Fizz";
            }
        } else if(number % 5 == 0){
            return "Buzz";
        }

        return Integer.toString(number);
    }
}
