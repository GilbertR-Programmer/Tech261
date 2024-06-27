package com.sparta.grr.FindTriplet;

import com.sparta.grr.FindTriplet.Logging.LoggerInitialiser;

import java.util.logging.Level;
import java.util.logging.Logger;

public class FindTriplet {

    private static final Logger logger = Logger.getLogger(FindTriplet.class.getName());

    static {
        LoggerInitialiser.setupLogger(logger, Level.ALL, Level.INFO);
    }

    public static boolean containsTriplet(int[] numberArray){
        if(isNull(numberArray)){
            logger.info("Found a null Value");
            return false;
        }

        logger.fine("Checking array for triplet in containsTriple");
        int matchCount = 0;
        for(int element = 1; element < numberArray.length; element++){
            logger.finer("Within loop in containsTriple");
            if(numberArray[element] == numberArray[element-1]){
                matchCount++;
                if(matchCount == 2){
                    logger.finest("found triple in containsTriple");
                    return true;
                }
            } else{
                matchCount = 0;
            }

        }
        logger.finer("Found no Triple in containsTriple");
        return false;
    }

    private static boolean isNull(int[] arrayForChecking){
        return arrayForChecking == null;
    }

}
