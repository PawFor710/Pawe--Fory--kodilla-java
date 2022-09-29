package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.addToDoList("cleaning");
        board.addInProgressList("cooking");
        board.addDoneList("learning");
        System.out.println(board.read());

        //Then
        String result0 = board.read().get(0);
        String result1 = board.read().get(1);
        String result2 = board.read().get(2);
        int quantity = board.read().size();
        assertEquals("cleaning", result0);
        assertEquals("cooking", result1);
        assertEquals("learning", result2);
        assertEquals(3, quantity);

    }
}
