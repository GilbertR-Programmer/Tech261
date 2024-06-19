package com.sparta.grr;

public class ArrayToInt {
    public static int getAsInt(int[] arrayOfInts){
        if(arrayOfInts.length < 1){
            return 0;
        }
        StringBuilder builder = new StringBuilder();
        for (int num : arrayOfInts){
            if(num < 0){
                num *= -1;
            }
            builder.append(num);
        }
        return Integer.parseInt(builder.toString());

    }


}
