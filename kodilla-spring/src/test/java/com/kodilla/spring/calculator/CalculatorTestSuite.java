package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculationsAdd() {
        double a = 1;
        double b = 2;

        String sum = calculator.add(a, b);

        assertEquals("3.0", sum);
    }

    @Test
    void testCalculationsSub() {
        double a = 2;
        double b = 2;

        String sub = calculator.sub(a, b);

        assertEquals("0.0", sub);
    }

    @Test
    void testCalculationsMul() {
        double a = 10;
        double b = 2;

        String sub = calculator.mul(a, b);

        assertEquals("20.0", sub);
    }

    @Test
    void testCalculationsDiv() {
        double a = 2;
        double b = 2;

        String div = calculator.div(a, b);

        assertEquals("1.0", div);
    }

    @Test
    void testThrowsArtmeticExeption() {
        assertThrows(ArithmeticException.class, () -> {
            calculator.div(2, 0);
        });
    }

}
