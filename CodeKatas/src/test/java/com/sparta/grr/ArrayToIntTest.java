package com.sparta.grr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ArrayToIntTest {
    //Should return a int when given an array of ints[]
    //should return integers as an int in the order they were given

    @Test
    @DisplayName("Given an array of ints[] return int")
    void givenArrayOfIntsReturnInt(){
        //Arrange
        int expectedOutput = 1;
        int[] inputs = new int[]{1};
        //Act
        int actualOutput = ArrayToInt.getAsInt(inputs);
        //Assert
        Assertions.assertEquals(expectedOutput,actualOutput);

    }

    @Test
    @DisplayName("Given an array of ints[] return as ints connected")
    void givenArrayOfIntsReturnAsIntsConnected(){
        //Arrange
        int expectedOutput = 1245;
        int[] inputs = new int[]{1,2,4,5};
        //Act
        int actualOutput = ArrayToInt.getAsInt(inputs);
        //Assert
        Assertions.assertEquals(expectedOutput,actualOutput);

    }

    @Test
    @DisplayName("Given an empty array of ints[] return 0")
    void givenEmptyArrayOfIntsReturnZero(){
        //Arrange
        int expectedOutput = 0;
        int[] inputs = new int[]{};
        //Act
        int actualOutput = ArrayToInt.getAsInt(inputs);
        //Assert
        Assertions.assertEquals(expectedOutput,actualOutput);

    }

    @Test
    @DisplayName("Given an array of ints[] starting with zero return an int with no leading 0")
    void givenArrayBeginingWithZeroOfIntsReturnIntWithNoLeadingZero(){
        //Arrange
        int expectedOutput = 3456;
        int[] inputs = new int[]{0,34,5,6};
        //Act
        int actualOutput = ArrayToInt.getAsInt(inputs);
        //Assert
        Assertions.assertEquals(expectedOutput,actualOutput);

    }

    @Test
    @DisplayName("Given an array of ints[] containing negatives return an int that treated them as positives")
    void givenArrayBeginingWithNegativeIntsReturnIntTreatingThemAsPositives(){
        //Arrange
        int expectedOutput = 3496;
        int[] inputs = new int[]{34,-9,6};
        //Act
        int actualOutput = ArrayToInt.getAsInt(inputs);
        //Assert
        Assertions.assertEquals(expectedOutput,actualOutput);

    }



}
