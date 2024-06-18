package com.sparta.grr;

public class FizzBuzz {
    public static String getFizzBuzzOf(int number){
        boolean isMultipleOfFive = number % 5 == 0;
        if(number % 3 == 0){
            if(isMultipleOfFive){
                return "FizzBuzz";
            } else {
                return "Fizz";
            }
        } else if(isMultipleOfFive){
            return "Buzz";
        }
        return Integer.toString(number);
    }
}
