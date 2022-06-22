package com.kodilla.testing.statistics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
public class StatisticsCalculatorTestSuite {

    @Mock
    private Statistics statisticsMock;

    @Test
    void testCalculateAdvStatistics() {


        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
    }
}
