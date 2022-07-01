package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        World world = new World();

        //When
        BigDecimal people = world.getPeopleQuantity();

        //Then
        BigDecimal expected = new BigDecimal("145063215");
        assertEquals(expected, people);
    }
}
