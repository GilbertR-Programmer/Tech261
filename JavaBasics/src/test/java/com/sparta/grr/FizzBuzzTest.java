package com.sparta.grr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Named.named;
import static org.junit.jupiter.params.provider.Arguments.arguments;

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
    @CsvSource({
            "3, Fizz",
            "6, Fizz",
            "9, Fizz"
    })
    @DisplayName("Given a multiple of 3 as input print Fizz")
    void givenAMultipleOfThreeFizzBuzzThenReturnsFizz(int input, String expectedOutput){
        // Arrange

        // Act
        String actualOutput = FizzBuzz.getFizzBuzzOf(input);

        // Assert
        Assertions.assertEquals(expectedOutput,actualOutput);
    }

    @ParameterizedTest
    @CsvSource({
            "5, Buzz",
            "10, Buzz",
            "20, Buzz"
    })
    @DisplayName("Given a multiple of 5 as input print Buzz")
    void givenAMultipleOfFiveFizzBuzzThenReturnsBuzz(int input, String expectedOutput){
        // Arrange

        // Act
        String actualOutput = FizzBuzz.getFizzBuzzOf(input);

        // Assert
        Assertions.assertEquals(expectedOutput,actualOutput);
    }

    @ParameterizedTest
    @MethodSource("multipleOfBothArguments")
    @DisplayName("Given a multiple of 3 and 5 as input print FizzBuzz")
    void givenAMultipleOfFiveAndThreeFizzBuzzThenReturnsFizzBuzz(int input, String expectedOutput){
        // Arrange

        // Act
        String actualOutput = FizzBuzz.getFizzBuzzOf(input);

        // Assert
        Assertions.assertEquals(expectedOutput,actualOutput);
    }

    //worth noting that using MethodSource is less efficient than csv in this case
    static Stream<Arguments> multipleOfBothArguments() {
        return Stream.of(
                arguments(15,"FizzBuzz"),
                arguments(30,"FizzBuzz"),
                arguments(60,"FizzBuzz")
        );
    }
}
