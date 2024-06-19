package com.sparta.grr.FindTripletTest;

import com.sparta.grr.FindTriplet.FindTriplet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
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
}
