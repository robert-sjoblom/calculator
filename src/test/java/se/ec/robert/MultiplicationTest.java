package se.ec.robert;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplicationTest {
    @Test
    public void calculateResult() {
        Multiplication multiplication = new Multiplication();

        assertEquals(5, multiplication.calculateResult(2, 2.5), 0);
        assertEquals(10, multiplication.calculateResult(-2, -5), 0);
        assertEquals(-10, multiplication.calculateResult(-2, 5), 0);
    }
}