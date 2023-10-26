package Sem12.test.calculator;

import Sem12.calculator.Calculator;

import static org.junit.Assert.*;
import org.junit.Test;


public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 2);
        assertEquals(4, result);
    }
}
