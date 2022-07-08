package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculations() {

        //Given
        //When
        calculator.add(5, 6);
        calculator.sub(5, 6);
        calculator.mul(3, 2);
        calculator.div(3, 6);
        //Then
    }
}
