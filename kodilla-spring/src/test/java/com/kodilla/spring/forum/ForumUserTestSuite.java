package com.kodilla.spring.forum;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;

public class ForumUserTestSuite {

    @Test
    void testGetUsername() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.forum");

        //When
        String name = (context.getBean(ForumUser.class)).username;

        //Then
        assertEquals("John Smith", name);
    }
}
