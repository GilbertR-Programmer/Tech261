package com.sparta.grr;

public class Program {



    public static void main(String[] args)
    {
        int timeOfDay = 21;
        System.out.println(getGreeting(timeOfDay));

    }

    public static String getGreeting(int timeOfDay) {
        if (!isValidData(timeOfDay)){
            return "invalidData";
        }
        String greeting;
        if (timeOfDay >= 5 && timeOfDay <= 18){
            if (timeOfDay <= 11){
                greeting = "Good morning!";
            }
            else {
                greeting = "Good afternoon!";
            }
        }
        else
        {
            greeting = "Good evening!";
        }
        return greeting;
    }

    private static boolean isValidData(int timeOfDay) {
        return timeOfDay > 0 && timeOfDay <= 24;
    }
}
