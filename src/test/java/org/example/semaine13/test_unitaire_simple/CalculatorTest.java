package org.example.semaine13.test_unitaire_simple;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Addition de deux nombres")
    void testAdd() {
        assertEquals(5, calculator.add(2, 3), "2 + 3 devrait être égal à 5");
    }


    @Test
    @DisplayName("Soustraction de deux nombres")
    void testSubtract() {
        assertEquals(2, calculator.subtract(5, 3), "5 - 3 devrait être égal à 2");
    }

    @Test
    @DisplayName("Multiplication de deux nombres")
    void testMultiply() {
        assertEquals(15, calculator.multiply(3, 5), "3 * 5 devrait être égal à 15");
    }

    @Test
    @DisplayName("Division de deux nombres")
    void testDivide() {
        assertEquals(2, calculator.divide(10, 5), "10 / 5 devrait être égal à 2");
    }

    @Test
    @DisplayName("Division par zéro devrait lancer une exception")
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0),
                "La division par zéro devrait lancer une ArithmeticException");
    }
}