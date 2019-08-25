package se.ec.robert;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for Calculator
 */
public class CalculatorTest {
    @Test
    public void makeCalculation() {
        Calculator calculator = new Calculator();

        assertEquals(10, calculator.makeCalculation(5, 5, '+'), 0);
        assertEquals(5, calculator.makeCalculation(10, 5, '-'), 0);
        assertEquals(100, calculator.makeCalculation(10, 10, '*'), 0);
        assertEquals(25, calculator.makeCalculation(100, 4, '/'), 0);
        assertEquals(-18, calculator.makeCalculation(-9, 2, '*'), 0);
    }
}
