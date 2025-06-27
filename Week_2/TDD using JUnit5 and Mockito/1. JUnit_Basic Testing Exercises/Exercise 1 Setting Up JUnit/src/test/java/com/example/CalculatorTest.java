package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private final Calculator calc = new Calculator();

    @Test
    public void testAddPositiveNumbers() {
        assertEquals("10 + 5 should be 15", 15, calc.add(10, 5));
    }

    @Test
    public void testAddWithNegative() {
        assertEquals("5 + (-3) should be 2", 2, calc.add(5, -3));
    }

    @Test
    public void testSubtract() {
        assertEquals("10 - 4 should be 6", 6, calc.subtract(10, 4));
    }
}
