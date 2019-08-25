package se.ec.robert;

import org.junit.Test;

import static org.junit.Assert.*;

public class SubtractionTest {
    @Test
    public void calculateResult() {
        Subtraction subtraction = new Subtraction();
        assertEquals(5, subtraction.calculateResult(10, 5), 0);
        assertEquals(-5, subtraction.calculateResult(10, 15), 0);
        assertEquals(0, subtraction.calculateResult(0, 0), 0);
    }
}