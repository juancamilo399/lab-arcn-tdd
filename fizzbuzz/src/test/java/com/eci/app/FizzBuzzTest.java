package com.eci.app;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    @Test
    void testFizzBuzzReturnsSameNumber() {
        // Arrange
        int input1 = 1;
        int input2 = 7;
        int input3 = 8;

        // Act
        String result1 = FizzBuzz.fizzbuzz(input1);
        String result2 = FizzBuzz.fizzbuzz(input2);
        String result3 = FizzBuzz.fizzbuzz(input3);

        // Assert
        assertEquals("1", result1);
        assertEquals("7", result2);
        assertEquals("8", result3);
    }

    @Test
    void testFizzBuzzMultipleOf3() {
        // Arrange
        int input = 3;

        // Act
        String result = FizzBuzz.fizzbuzz(input);

        // Assert
        assertEquals("Fizz", result);
    }

    @Test
    void testFizzBuzzMultipleOf5() {
        // Arrange
        int input = 5;

        // Act
        String result = FizzBuzz.fizzbuzz(input);

        // Assert
        assertEquals("Buzz", result);
    }

    @Test
    void testFizzBuzzMultipleOf3And5() {
        // Arrange
        int input = 15;

        // Act
        String result = FizzBuzz.fizzbuzz(input);

        // Assert
        assertEquals("FizzBuzz", result);
    }
}
