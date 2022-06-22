package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {

        //Given
        //When
        int[] tab = {2, 5, 8, 12, 22, 4, 12, 4, 24, 54, 33, 87, 56, 29, 16, 43, 27, 85, 97, 12};
        double mean = ArrayOperations.getAverage(tab);

        //Then
        assertEquals(31.6, mean, 0.1);
    }
}