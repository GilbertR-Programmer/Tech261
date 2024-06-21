package com.sparta.grr.FindTriplet;

public class FindTriplet {

    public static boolean containsTriplet(int[] numberArray){
        if(isNull(numberArray)){
            return false;
        }

        int matchCount = 0;
        for(int element = 1; element < numberArray.length; element++){
            if(numberArray[element] == numberArray[element-1]){
                matchCount++;
                if(matchCount == 2){
                    return true;
                }
            } else{
                matchCount = 0;
            }

        }
        return false;
    }

    private static boolean isNull(int[] arrayForChecking){
        return arrayForChecking == null;
    }

}
