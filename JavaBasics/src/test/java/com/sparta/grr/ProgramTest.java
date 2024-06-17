package com.sparta.grr;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import javax.lang.model.type.ErrorType;
import java.util.Random;

public class ProgramTest {

    //here we define a random for generating test data
    private Random rng = new Random();

    @Test
    @DisplayName("Given a time of 21, then the greeting should be Good evening!")
    void checkThat21GivesGoodEvening(){
        int time = 21;
        String expectedGreeting = "Good evening!";
        String actualGreeting = Program.getGreeting(time);
        Assertions.assertEquals(expectedGreeting,actualGreeting);
    }

    @Test
    @DisplayName("Given a time of 17, then the greeting should be Good afternoon!")
    void checkThat17GivesGoodAfternoon(){
        int time = 17;
        String expectedGreeting = "Good afternoon!";
        String actualGreeting = Program.getGreeting(time);
        Assertions.assertEquals(expectedGreeting,actualGreeting);
    }

    @Test
    @DisplayName("Given a time of 12, then the greeting should be Good afternoon!")
    void checkThat12GivesGoodAfternoon(){
        int time = 12;
        String expectedGreeting = "Good afternoon!";
        String actualGreeting = Program.getGreeting(time);
        Assertions.assertEquals(expectedGreeting,actualGreeting);
    }

    @Test
    @DisplayName("Given a time of 8, then the greeting should be Good morning!")
    void checkThat8GivesGoodMorning(){
        int time = 8;
        String expectedGreeting = "Good morning!";
        String actualGreeting = Program.getGreeting(time);
        Assertions.assertEquals(expectedGreeting,actualGreeting);
    }

    @Test
    @DisplayName("Given a time of -1, then an error should be thrown")
    void checkThatNegative1ThrowsError(){
        int time = -1;
        Assertions.assertThrows(
                Exception.class,
                () -> Program.getGreeting(time),
                "Expected getGreeting to throw error, but it didn't"
        );
    }

    @Test
    @DisplayName("Given a random valid (1-24) time, then text should be returned")
    void checkThatValidRandomReturnsText(){
        int time = rng.nextInt(1,25);
        Assertions.assertFalse(Program.getGreeting(time).isBlank());
    }

}
