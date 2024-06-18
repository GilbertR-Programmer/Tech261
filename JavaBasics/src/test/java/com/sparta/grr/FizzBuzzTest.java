package com.sparta.grr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class FizzBuzzTest {
    // Print numbers in order
    // If the number is divisible by 3 print "Fizz"
    // If the number is divisible by 5 print "Buzz"
    // If the number is divisible by both print "FizzBuzz"

    @Test
    @DisplayName("Given an input of 1 print 1")
    void givenAnInputOfOneFizzBuzzThenReturnsOne(){
        // Arrange
        int input = 1;
        String expectedOutput = "1";

        // Act
        String actualOutput = FizzBuzz.getFizzBuzzOf(input);

        // Assert
        Assertions.assertEquals(expectedOutput,actualOutput);
    }

    @ParameterizedTest
    @CsvSource({
            "1, 1",
            "2, 2",
            "7, 7"
    })
    @DisplayName("Given inputs not divisible by 3 or 5 print them")
    void givenInputsNotDivisibleByThreeOrFivePrintThem(int input, String expectedOutput){
        // Arrange

        // Act
        String actualOutput = FizzBuzz.getFizzBuzzOf(input);

        // Assert
        Assertions.assertEquals(expectedOutput,actualOutput);
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9})
    @DisplayName("Given a multiple of 3 as input print Fizz")
    void givenAMultipleOfThreeFizzBuzzThenReturnsFizz(int input){
        // Arrange
        String expectedOutput = "Fizz";

        // Act
        String actualOutput = FizzBuzz.getFizzBuzzOf(input);

        // Assert
        Assertions.assertEquals(expectedOutput,actualOutput);
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 25})
    @DisplayName("Given a multiple of 5 as input print Fizz")
    void givenAMultipleOfFiveFizzBuzzThenReturnsBuzz(int input){
        // Arrange
        String expectedOutput = "Buzz";

        // Act
        String actualOutput = FizzBuzz.getFizzBuzzOf(input);

        // Assert
        Assertions.assertEquals(expectedOutput,actualOutput);
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30})
    @DisplayName("Given a multiple of 3 and 5 as input print FizzBuzz")
    void givenAMultipleOfFiveAndThreeFizzBuzzThenReturnsFizzBuzz(int input){
        // Arrange
        String expectedOutput = "FizzBuzz";

        // Act
        String actualOutput = FizzBuzz.getFizzBuzzOf(input);

        // Assert
        Assertions.assertEquals(expectedOutput,actualOutput);
    }
}
