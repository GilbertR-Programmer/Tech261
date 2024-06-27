package com.sparta.grr;

import org.junit.jupiter.api.*;

import java.time.LocalDate;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class HamcrestExampleTests {
    private Spartan manish;

    @BeforeEach
    void setup(){
        manish = new Spartan(1,"Manish","Java", LocalDate.of(2000,1,1));
    }

    @Nested
    @DisplayName("Hamcrest Spartan tests")
    class hamcrestSpartanTests{
        @Test
        @DisplayName("Check spartan is calle manish")
        void checkSpartanIsCalledManish(){
            assertThat(manish.getName(), equalTo("Manish"));
        }

        @Test
        @DisplayName("Check spartan has field called name")
        void checkSpartanHasAFieldName(){
            assertThat(manish,hasProperty("name"));
        }

        @Test
        @DisplayName("Check spartan has field called course set to java")
        void checkSpartanHasAFieldCourseSetToJava(){
            assertThat(manish,hasProperty("course",equalTo("Java")));
        }
    }

    @Nested
    @DisplayName("Hamcrest Spring Methods")
    class hamcrestStringMethods {
        @Test
        @DisplayName("Check name isn't empty")
        void checkNameIsNotEmpty() {
            assertThat(manish.getName(), is(not(emptyOrNullString())));
        }

        @Test
        @DisplayName("Check that name ends with ish")
        void checkSpartanHasAFieldName() {
            assertThat(manish.getName(), endsWith("ish"));
        }
    }

    @Nested
    @DisplayName("Extra Test Methods")
    class ExtraTestMethods{
        @Test
        @DisplayName("Check that spartan has an id")
        void checkSpartanHasAFieldId() {
            assertThat(manish, hasProperty("id"));
        }

        @Test
        @DisplayName("Check that spartan has an joindate and it's in the past")
        void checkSpartanHasAFieldstartDateBeforeNow() {
            assertThat(manish, hasProperty("startDate",is(lessThan(LocalDate.now()))));
        }
    }




}
