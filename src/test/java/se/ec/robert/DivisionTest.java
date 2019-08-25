package se.ec.robert;

import org.junit.Test;
import static org.junit.Assert.*;

public class DivisionTest {
    @Test
    public void calculateResult() {
        Division division = new Division();

        assertEquals(2.5, division.calculateResult(5, 2), 0);
        assertEquals(3, division.calculateResult(9, 3), 0);
        assertEquals(4, division.calculateResult(-8, -2), 0);
        assertEquals(-4, division.calculateResult(-8, 2), 0);
    }
}