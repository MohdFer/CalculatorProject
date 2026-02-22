package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void addTest() {
        Calculator calc = new Calculator();
        assertEquals(8, calc.add(5, 3));
    }
}