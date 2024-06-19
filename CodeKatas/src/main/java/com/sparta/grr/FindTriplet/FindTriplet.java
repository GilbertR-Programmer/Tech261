package com.sparta.grr.FindTriplet;

public class FindTriplet {
    public static boolean containsTriplet(int[] numberArray){
        if(isNull(numberArray)){
            return false;
        }

        int matchCount = 0;
        for(int i = 1; i < numberArray.length; i++){
            if(numberArray[i] == numberArray[i-1]){
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
