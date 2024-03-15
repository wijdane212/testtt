package org.example;

import java.time.LocalDate;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {

    @Test
    void testGetDisplayName() {
      //  Person person = new Person("Josh", "Hayden");
       // String displayName = person.getDisplayName();
        //Assertions.assertEquals("Hayden, Josh", displayName);
    }
    void testGetAge() {
        Person person = new Person("Joey", "Doe", LocalDate.parse("2013-01-12"));
        long age = person.getAge();
        assertEquals(4, age);
    }



}
