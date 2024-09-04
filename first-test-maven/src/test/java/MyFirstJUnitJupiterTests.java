

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import dev.csec302.Calculator;

import org.junit.jupiter.api.Test;

class MyFirstJUnitJupiterTests {

    private final Calculator calculator = new Calculator();

    @Test
    void addition() {
        assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
    }

    @Test
    void subtraction() {
        assertEquals(0, calculator.subtract(1, 1), "1 - 1 should equal 0");
    }

    @Test
    void subtract_negative() {
        double expected = -2;
        double actual = calculator.subtract(1, 3);
        assertTrue(expected == actual, "1 - 3 should equal -2");
        //assertEquals(-2, calculator.subtract(1, 3), "1 - 3 should equal -2");
    }

}

