package com.example.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testPerformAddition() {
        assertEquals(5, calculator.performAddition(2, 3));
        assertEquals(0, calculator.performAddition(-1, 1));
    }

    @Test
    void testPerformSubtraction() {
        assertEquals(1, calculator.performSubtraction(3, 2));
        assertEquals(-2, calculator.performSubtraction(-1, 1));
    }

    @Test
    void testPerformMultiplication() {
        assertEquals(6, calculator.performMultiplication(2, 3));
        assertEquals(0, calculator.performMultiplication(0, 5));
    }

    @Test
    void testPerformDivision() {
        assertEquals(2.0, calculator.performDivision(6, 3));
        assertThrows(ArithmeticException.class, () -> calculator.performDivision(1, 0));
    }

    @Test
    void testCheckNumberType() {
        assertEquals("Even Prime", calculator.checkNumberType(2));
        assertEquals("Odd Prime", calculator.checkNumberType(3));
        assertEquals("Even", calculator.checkNumberType(4));
        assertEquals("Odd", calculator.checkNumberType(5));
    }
}