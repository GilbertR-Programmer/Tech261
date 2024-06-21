package com.sparta.grr.PalindromeKata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

public class PalindromeKataTest {
    //    Must have at least 3 characters
    //    case-insensitive
    //    handle nulls and empties
    //    Is the same backwards and forwards
    //    Don't do anything special with spaces
    //    return true if palindrome else false

    //IS PALINDROME TESTS

    @ParameterizedTest
    @ValueSource(strings = {"lamal", "racecar", "bob"})
    @DisplayName("Given a string that's a palindrome return true")
    void givenStringThatIsPalindromeReturnTrue(String input){
        //Arrange
        boolean expectedOutput = true;
        //Act
        boolean actualOutput = PalindromeKata.isPalindrome(input);
        //Assert
        Assertions.assertEquals(expectedOutput,actualOutput);
    }

    @ParameterizedTest
    @ValueSource(strings = {"lAmal", "raCecAr", "Bob"})
    @DisplayName("Given a string that's a palindrome but a mixed case return true")
    void givenStringThatIsPalindromeButIsMixedCaseReturnTrue(String input){
        //Arrange
        boolean expectedOutput = true;
        //Act
        boolean actualOutput = PalindromeKata.isPalindrome(input);
        //Assert
        Assertions.assertEquals(expectedOutput,actualOutput);
    }

    @Test
    @DisplayName("Given a null return false")
    void givenStringThatIsNullReturnFalse(){
        //Arrange
        String input = null;
        boolean expectedOutput = false;
        //Act
        boolean actualOutput = PalindromeKata.isPalindrome(input);
        //Assert
        Assertions.assertEquals(expectedOutput,actualOutput);
    }

    @Test
    @DisplayName("Given an empty string return false")
    void givenStringThatIsEmptyReturnFalse(){
        //Arrange
        String input = "";
        boolean expectedOutput = false;
        //Act
        boolean actualOutput = PalindromeKata.isPalindrome(input);
        //Assert
        Assertions.assertEquals(expectedOutput,actualOutput);
    }

    @ParameterizedTest
    @ValueSource(strings = {"ll", "ra", "bb"})
    @DisplayName("Given a string that's too short to be a palindrome return false")
    void givenStringThatIsTooShortToBePalindromeReturnFalse(String input){
        //Arrange
        boolean expectedOutput = false;
        //Act
        boolean actualOutput = PalindromeKata.isPalindrome(input);
        //Assert
        Assertions.assertEquals(expectedOutput,actualOutput);
    }


    @ParameterizedTest
    @MethodSource("sentenceReturnsPalindromeHappyCase")
    @DisplayName("Given a sentence find and return it's largest palindrome(s)")
    void givenStringSentenceReturnTheBiggestPalindromesInIt(String input, String[] expectedOutput){
        //Arrange

        //Act
        String[] actualOutput = PalindromeKata.getPalindromes(input);
        //Assert
        Assertions.assertArrayEquals(expectedOutput,actualOutput);
    }

    static Stream<Arguments> sentenceReturnsPalindromeHappyCase() {
        return Stream.of(
                Arguments.arguments("Racecar driver calos sainz",new String[]{"racecar"}),
                Arguments.arguments("Racecaar driver calos snans",new String[]{"snans"})
        );
    }

    @ParameterizedTest
    @MethodSource("sentenceReturnsPalindromeSadCase")
    @DisplayName("Given a sentence without palindromes return an empty list")
    void givenStringSentenceWithNoPalindromesReturnEmptyArray(String input, String[] expectedOutput){
        //Arrange

        //Act
        String[] actualOutput = PalindromeKata.getPalindromes(input);
        //Assert
        Assertions.assertArrayEquals(expectedOutput,actualOutput);
    }

    static Stream<Arguments> sentenceReturnsPalindromeSadCase() {
        return Stream.of(
                Arguments.arguments("I contain no palindromes",new String[]{}),
                Arguments.arguments("you find no wisdome here",new String[]{})
        );
    }

    @ParameterizedTest
    @MethodSource("sentenceReturnsPalindromeSpecialCharacterHappyCase")
    @DisplayName("Given a sentence find and return it's largest palindrome(s) even if the palindromes contain special characters")
    void givenStringSentenceWithSpecialCharactersReturnTheBiggestPalindromesInIt(String input, String[] expectedOutput){
        //Arrange

        //Act
        String[] actualOutput = PalindromeKata.getPalindromes(input);
        //Assert
        Assertions.assertArrayEquals(expectedOutput,actualOutput);
    }

    static Stream<Arguments> sentenceReturnsPalindromeSpecialCharacterHappyCase() {
        return Stream.of(
                Arguments.arguments("Rac)ecar driver cal&os sainz",new String[]{"racecar"}),
                Arguments.arguments("Racecaar driver calos sn£ans",new String[]{"snans"})
        );
    }

    @ParameterizedTest
    @MethodSource("sentenceReturnsOnlyLongestPalindromeCase")
    @DisplayName("Given a sentence find and return it's largest palindrome(s) even if there are other smaller ones")
    void givenStringSentenceWithTwoPalindromesReturnTheLargest(String input, String[] expectedOutput){
        //Arrange

        //Act
        String[] actualOutput = PalindromeKata.getPalindromes(input);
        //Assert
        Assertions.assertArrayEquals(expectedOutput,actualOutput);
    }

    static Stream<Arguments> sentenceReturnsOnlyLongestPalindromeCase() {
        return Stream.of(
                Arguments.arguments("Racecarracecar driver soos sainz",new String[]{"racecarracecar"}),
                Arguments.arguments("Racecar driver calos snans",new String[]{"racecar"}),
                Arguments.arguments("driver soos sainz Racecarracecar",new String[]{"racecarracecar"})
        );
    }

    @ParameterizedTest
    @MethodSource("sentenceReturnsMultipleLongestPalindromeCase")
    @DisplayName("Given a sentence find and return it's largest palindrome(s) even if there are multiple")
    void givenStringSentenceWithTwoPalindromesMatchingLengthReturnTheBoth(String input, String[] expectedOutput){
        //Arrange

        //Act
        String[] actualOutput = PalindromeKata.getPalindromes(input);
        //Assert
        Assertions.assertArrayEquals(expectedOutput,actualOutput);
    }

    static Stream<Arguments> sentenceReturnsMultipleLongestPalindromeCase() {
        return Stream.of(
                Arguments.arguments("Racecarracecar driver soos bacecarracecab",new String[]{"racecarracecar","bacecarracecab"}),
                Arguments.arguments("Raclelcar driver carolorac calos snans",new String[]{"raclelcar","carolorac"}),
                Arguments.arguments("driver foof noon",new String[]{"foof","noon"})
        );
    }

    @ParameterizedTest
    @MethodSource("sentenceReturnsOnePalindromeFromMatchingCase")
    @DisplayName("Given a sentence find and return it's largest palindrome(s) but not duplicates")
    void givenStringSentenceWithTwoPalindromesMatchingReturnOne(String input, String[] expectedOutput){
        //Arrange

        //Act
        String[] actualOutput = PalindromeKata.getPalindromes(input);
        //Assert
        Assertions.assertArrayEquals(expectedOutput,actualOutput);
    }

    static Stream<Arguments> sentenceReturnsOnePalindromeFromMatchingCase() {
        return Stream.of(
                Arguments.arguments("soos driver soos ",new String[]{"soos"}),
                Arguments.arguments("carolorac driver carolorac calos snans",new String[]{"carolorac"}),
                Arguments.arguments("driver foof foof",new String[]{"foof"})
        );
    }

    @ParameterizedTest
    @MethodSource("sentenceReturnsMultiplePalindromeFromMatchingCase")
    @DisplayName("Given a sentence find and return it's largest palindrome(s) but not duplicates with multiple longest")
    void givenStringSentenceWithTwoPalindromesMatchingReturnTwo(String input, String[] expectedOutput){
        //Arrange

        //Act
        String[] actualOutput = PalindromeKata.getPalindromes(input);
        //Assert
        Assertions.assertArrayEquals(expectedOutput,actualOutput);
    }

    static Stream<Arguments> sentenceReturnsMultiplePalindromeFromMatchingCase() {
        return Stream.of(
                Arguments.arguments("eooe soos driver soos ",new String[]{"eooe","soos"}),
                Arguments.arguments("carolorac darolorad driver carolorac calos snans",new String[]{"carolorac","darolorad"}),
                Arguments.arguments("driver foof foof dood",new String[]{"foof","dood"})
        );
    }

    @Test
    @DisplayName("Given a null return an empty array")
    void givenEmptyStringReturnEmptyArray(){
        //Arrange
        String input = null;
        String[] expectedOutput = new String[]{};
        //Act
        String[] actualOutput = PalindromeKata.getPalindromes(input);
        //Assert
        Assertions.assertArrayEquals(expectedOutput,actualOutput);
    }

    @Test
    @DisplayName("Given an empty string return empty")
    void givenStringThatIsEmptyReturnEmpty(){
        //Arrange
        String input = "";
        String[] expectedOutput = new String[]{};
        //Act
        String[] actualOutput = PalindromeKata.getPalindromes(input);
        //Assert
        Assertions.assertArrayEquals(expectedOutput,actualOutput);
    }
}
