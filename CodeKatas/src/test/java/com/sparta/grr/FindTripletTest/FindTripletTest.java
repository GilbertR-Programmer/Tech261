package com.sparta.grr.FindTripletTest;

import com.sparta.grr.FindTriplet.FindTriplet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class FindTripletTest {
    //    Take in an array of Ints and return a boolean
    //    Return true when three ints in a row match
    //    Return False in any other case
    //    Should return false if null is input or an empty or less than 3 array is input

    @ParameterizedTest
    @MethodSource("nonNullTests")
    @DisplayName("Given an array of ints[] return non null")
    void givenArrayOfIntsReturnNonNull(int[] inputs){
        //Arrange

        //Act
        boolean actualOutput = FindTriplet.containsTriplet(inputs);
        //Assert
        Assertions.assertNotEquals(null,actualOutput);
    }

    private static Stream<Arguments> nonNullTests() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3,4}),
                Arguments.of(new int[]{1,15,44,3}),
                Arguments.of(new int[]{1,15,7,6,4,3})
        );
    }

    @ParameterizedTest
    @MethodSource("hasTripletTests")
    @DisplayName("Given an array of ints[] with sequence of three matching numbers return true")
    void givenArrayOfIntsWithTripletReturnTrue(int[] inputs, boolean expectedOutput){
        //Arrange

        //Act
        boolean actualOutput = FindTriplet.containsTriplet(inputs);
        //Assert
        Assertions.assertEquals(expectedOutput,actualOutput);
    }

    private static Stream<Arguments> hasTripletTests() {
        return Stream.of(
                Arguments.of(new int[]{1,2,2,2},true),
                Arguments.of(new int[]{1,1,1,3},true),
                Arguments.of(new int[]{12,1,1,1,6,4,3},true)
        );
    }

    @ParameterizedTest
    @MethodSource("hasNoTripletTests")
    @DisplayName("Given an array of ints[] without sequence of three matching numbers return false")
    void givenArrayOfIntsWithoutTripletReturnFalse(int[] inputs, boolean expectedOutput){
        //Arrange

        //Act
        boolean actualOutput = FindTriplet.containsTriplet(inputs);
        //Assert
        Assertions.assertEquals(expectedOutput,actualOutput);
    }

    private static Stream<Arguments> hasNoTripletTests() {
        return Stream.of(
                Arguments.of(new int[]{1,2,4,2},false),
                Arguments.of(new int[]{1,5,1,3},false),
                Arguments.of(new int[]{12,1,6,1,6,4,6},false)
        );
    }

    @Test
    @DisplayName("Given an null return false")
    void givenNullReturnFalse(){
        //Arrange
        boolean expectedOutput = false;
        //Act
        boolean actualOutput = FindTriplet.containsTriplet(null);
        //Assert
        Assertions.assertEquals(expectedOutput,actualOutput);
    }

    @Test
    @DisplayName("Given an empty Array return false")
    void givenEmptyArrayReturnFalse(){
        //Arrange
        boolean expectedOutput = false;
        int[] input = new int[]{};
        //Act
        boolean actualOutput = FindTriplet.containsTriplet(input);
        //Assert
        Assertions.assertEquals(expectedOutput,actualOutput);
    }

}
