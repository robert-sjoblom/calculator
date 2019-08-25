package se.ec.robert;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for Addition
 */
public class AdditionTest {
    @Test
    public void calculateResult() {
        Addition addition = new Addition();
        assertEquals(5, addition.calculateResult(2, 3), 0);
        assertEquals(-10, addition.calculateResult(5, -15), 0);
        assertEquals(-4, addition.calculateResult(-2, -2), 0);
    }
}
