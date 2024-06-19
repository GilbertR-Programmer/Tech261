package com.sparta.grr;

public class ArrayToInt {
    public static int getAsInt(int[] arrayOfInts){
        if(arrayOfInts.length < 1){
            return 0;
        }
        StringBuilder builder = new StringBuilder();
        for (int num : arrayOfInts){
            num = getPositiveOf(num);
            builder.append(num);
        }
        return Integer.parseInt(builder.toString());

    }

    private static int getPositiveOf(int number){
        if(number < 0){
            number *= -1;
        }
        return number;
    }

}
