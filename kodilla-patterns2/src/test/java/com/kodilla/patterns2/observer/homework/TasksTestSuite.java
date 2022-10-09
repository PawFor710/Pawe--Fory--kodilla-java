package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class TasksTestSuite {

    @Test
    public void testUpdate() {
        //Given
        JavaTasks javaTasks = new JavaTasks();
        PythonTasks pythonTasks = new PythonTasks();

        Mentor johnBonham = new Mentor("John Bonham");
        Mentor jimmyPage = new Mentor("Jimmy Page");
        Mentor robertPlant = new Mentor("Robert Plant");
        javaTasks.registerObserver(jimmyPage);
        javaTasks.registerObserver(johnBonham);
        pythonTasks.registerObserver(robertPlant);
        pythonTasks.registerObserver(jimmyPage);
        //When
        javaTasks.addDoneExercises("Test task");
        pythonTasks.addDoneExercises("Test task2");
        pythonTasks.addDoneExercises("Test task3");
        //Then
        assertEquals(3, jimmyPage.getUpdateCount());
        assertEquals(2, robertPlant.getUpdateCount());
        assertEquals(1, johnBonham.getUpdateCount());


    }

}