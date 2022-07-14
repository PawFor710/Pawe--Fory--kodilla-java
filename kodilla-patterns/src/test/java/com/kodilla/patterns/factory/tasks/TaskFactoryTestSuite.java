package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.doTask(TaskFactory.SHOPPING);
        //Then
        assertEquals("Shopping in local store", shopping.getTaskName());
        assertTrue(shopping.isTaskExecuted());
    }

    @Test
    void testFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.doTask(TaskFactory.PAINTING);
        //Then
        assertEquals("Painting my bedroom", painting.getTaskName());
        assertFalse(painting.isTaskExecuted());
    }

    @Test
    void testFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.doTask(TaskFactory.DRIVING);
        //Then
        assertEquals("Driving home", driving.getTaskName());
        assertTrue(driving.isTaskExecuted());
    }
}
