package com.sparta.grr;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;


import java.time.LocalDate;
import java.util.stream.Stream;

public class SpartanTest {

    @RepeatedTest(value = 10, name = "we doing numba {currentRepetition}")
    @DisplayName("Simple Test")
    void simpleTest() {
        Assertions.assertEquals(1,1);
    }

    @Test
    @DisplayName("Check name of Spartan")
    void checkNameOfSpartan(){
        Assumptions.assumeTrue(false);
        Assertions.assertEquals(1,2);
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"Brians","bob"})
    void checkLengthOfString(String name){
        Assertions.assertEquals(5,name.length());
    }

    @ParameterizedTest
    @NullAndEmptySource
    @MethodSource("getListOfNames")
    void checkLengthOfStringTwp(String name){
        Assertions.assertEquals(5,name.length());
    }

    public static Stream<Arguments> getListOfNames() {
        return Stream.of(
                Arguments.of("Meemah"),
                Arguments.of("Meema")
        );
    }

    //hooks
    //beforeall - once before all - static
    //beforeeach - runs again before each test
    //afterall - once after all tests - static
    //aftereach - once after ech test runs

    private static Spartan manish;

    @BeforeAll
    static void setupAll(TestInfo testInfo){
        manish = new Spartan(1,"Manish","Java", LocalDate.now());
        //bad practice
        System.out.println(testInfo.getDisplayName());
    }

    @BeforeEach
    void setup(){

    }

    @AfterEach
    void tearDown(){

    }

    @AfterAll
    static void tearDownAll(){

    }


}
