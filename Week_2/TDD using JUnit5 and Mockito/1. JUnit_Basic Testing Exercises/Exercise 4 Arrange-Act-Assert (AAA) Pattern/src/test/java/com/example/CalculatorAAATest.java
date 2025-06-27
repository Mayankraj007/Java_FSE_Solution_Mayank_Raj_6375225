package com.example;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorAAATest {

    private Calculator calc;

    @Before
    public void setUp() {
        // Arrange: initialize calculator before each test
        calc = new Calculator();
    }

    @After
    public void tearDown() {
        // Teardown: clean up after each test
        calc = null;
    }

    @Test
    public void testAdd_TwoPositiveNumbers() {
        // Arrange
        int a = 4;
        int b = 6;

        // Act
        int result = calc.add(a, b);

        // Assert
        assertEquals("4 + 6 should equal 10", 10, result);
    }

    @Test
    public void testSubtract_LargerMinusSmaller() {
        // Arrange
        int a = 9;
        int b = 3;

        // Act
        int result = calc.subtract(a, b);

        // Assert
        assertEquals("9 - 3 should equal 6", 6, result);
    }
}
