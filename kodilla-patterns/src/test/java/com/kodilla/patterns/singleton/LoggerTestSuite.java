package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {


    @Test
    void testLog() {
        //Given
        Logger logger = Logger.INSTANCE;
        logger.log("User");
        //When
        String result = logger.getLastLog();
        //Then
        assertEquals(result, "User");
    }
}
