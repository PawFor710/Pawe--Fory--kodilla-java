package com.kodilla.testing.statistics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class StatisticsCalculatorTestSuite {

    @Mock
    public Statistics statisticsMock;

    @Test
    void testCalculateAdvStatistics1() {
        //When post quantity = 0

        //Given
        List<String> usersNames = new ArrayList<>();
        usersNames.add("Paul");
        usersNames.add("Michael");
        usersNames.add("John");
        usersNames.add("Andrew");

        List<String> comments = new ArrayList<>();
        comments.add("Congratulation");
        comments.add("Best of luck!");
        comments.add("Hi. what's up?");
        comments.add("nice, good luck");

        List<String> posts = new ArrayList<>();

        //When
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(usersNames, comments, posts);
        double postPerUsers = statisticsCalculator.calculateAdvStatistics(statisticsMock).postPerUsers;
        double commentsPerUser = statisticsCalculator.calculateAdvStatistics(statisticsMock).commentsPerUser;

        //Then
        assertEquals(0, postPerUsers);
        assertEquals(1, commentsPerUser);
    }

    @Test
    void testCalculateAdvStatistics2() {
        //When post quantity = 1000

        //Given
        List<String> usersNames = new ArrayList<>();
        usersNames.add("Paul");
        usersNames.add("Michael");
        usersNames.add("John");
        usersNames.add("Andrew");

        List<String> comments = new ArrayList<>();
        comments.add("Congratulation");
        comments.add("Best of luck!");
        comments.add("Hi. what's up?");
        comments.add("nice, good luck");

        List<String> posts = new ArrayList<>();
        for(int i = 0; i < 1000; i++) {
            posts.add(" ");
        }

        //When
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(usersNames, comments, posts);
        double postPerUsers = statisticsCalculator.calculateAdvStatistics(statisticsMock).postPerUsers;
        double commentsPerUser = statisticsCalculator.calculateAdvStatistics(statisticsMock).commentsPerUser;
        double commentsPerPost = statisticsCalculator.calculateAdvStatistics(statisticsMock).commentsPerPost;

        //Then
        assertEquals(250, postPerUsers);
        assertEquals(1, commentsPerUser);
        assertEquals(0.004, commentsPerPost);
    }

    @Test
    void testCalculateAdvStatistics3() {
        //When comments quantity = 0

        //Given
        List<String> usersNames = new ArrayList<>();
        usersNames.add("Paul");
        usersNames.add("Michael");
        usersNames.add("John");
        usersNames.add("Andrew");

        List<String> comments = new ArrayList<>();


        List<String> posts = new ArrayList<>();
        posts.add("Hi! I just join this community");
        posts.add("Anyone know some good films");
        posts.add("Hi everyone!");
        posts.add("What's up?");

        //When
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(usersNames, comments, posts);
        double postPerUsers = statisticsCalculator.calculateAdvStatistics(statisticsMock).postPerUsers;
        double commentsPerUser = statisticsCalculator.calculateAdvStatistics(statisticsMock).commentsPerUser;
        double commentsPerPost = statisticsCalculator.calculateAdvStatistics(statisticsMock).commentsPerPost;

        //Then
        assertEquals(1, postPerUsers);
        assertEquals(0, commentsPerUser);
        assertEquals(0, commentsPerPost);
    }

    @Test
    void testCalculateAdvStatistics4() {
        //When comments quantity < posts quantity

        //Given
        List<String> usersNames = new ArrayList<>();
        usersNames.add("Paul");
        usersNames.add("Michael");
        usersNames.add("John");
        usersNames.add("Andrew");

        List<String> comments = new ArrayList<>();
        comments.add("Congratulation");
        comments.add("Best of luck!");
        comments.add("Hi. what's up?");


        List<String> posts = new ArrayList<>();
        posts.add("Hi! I just join this community");
        posts.add("Anyone know some good films");
        posts.add("Hi everyone!");
        posts.add("What's up?");

        //When
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(usersNames, comments, posts);
        double postPerUsers = statisticsCalculator.calculateAdvStatistics(statisticsMock).postPerUsers;
        double commentsPerUser = statisticsCalculator.calculateAdvStatistics(statisticsMock).commentsPerUser;
        double commentsPerPost = statisticsCalculator.calculateAdvStatistics(statisticsMock).commentsPerPost;

        //Then
        assertEquals(1, postPerUsers);
        assertEquals(0.75, commentsPerUser);
        assertEquals(0.75, commentsPerPost);
    }

    @Test
    void testCalculateAdvStatistics5() {
        //When comments quantity > posts quantity

        //Given
        List<String> usersNames = new ArrayList<>();
        usersNames.add("Paul");
        usersNames.add("Michael");
        usersNames.add("John");
        usersNames.add("Andrew");

        List<String> comments = new ArrayList<>();
        comments.add("Congratulation");
        comments.add("Best of luck!");
        comments.add("Hi. what's up?");
        comments.add("nice, good luck");


        List<String> posts = new ArrayList<>();
        posts.add("Hi! I just join this community");
        posts.add("Anyone know some good films");
        posts.add("Hi everyone!");

        //When
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(usersNames, comments, posts);
        double postPerUsers = statisticsCalculator.calculateAdvStatistics(statisticsMock).postPerUsers;
        double commentsPerUser = statisticsCalculator.calculateAdvStatistics(statisticsMock).commentsPerUser;
        double commentsPerPost = statisticsCalculator.calculateAdvStatistics(statisticsMock).commentsPerPost;

        //Then
        assertEquals(0.75, postPerUsers);
        assertEquals(1, commentsPerUser);
        assertEquals(1.33, commentsPerPost, 0.01);
    }

    @Test
    void testCalculateAdvStatistics6() {
        //When users quantity = 0

        //Given
        List<String> usersNames = new ArrayList<>();


        List<String> comments = new ArrayList<>();
        comments.add("Congratulation");
        comments.add("Best of luck!");
        comments.add("Hi. what's up?");
        comments.add("nice, good luck");


        List<String> posts = new ArrayList<>();
        posts.add("Hi! I just join this community");
        posts.add("Anyone know some good films");
        posts.add("Hi everyone!");

        //When
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(usersNames, comments, posts);
        double commentsPerPost = statisticsCalculator.calculateAdvStatistics(statisticsMock).commentsPerPost;

        //Then
        assertEquals(1.33, commentsPerPost, 0.01);
    }

    @Test
    void testCalculateAdvStatistics7() {
        //When users quantity = 100

        //Given
        List<String> usersNames = new ArrayList<>();
        for(int i = 0; i < 100; i++) {
            usersNames.add(" ");
        }

        List<String> comments = new ArrayList<>();
        comments.add("Congratulation");
        comments.add("Best of luck!");
        comments.add("Hi. what's up?");
        comments.add("nice, good luck");


        List<String> posts = new ArrayList<>();
        posts.add("Hi! I just join this community");
        posts.add("Anyone know some good films");
        posts.add("Hi everyone!");

        //When
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(usersNames, comments, posts);
        double postPerUsers = statisticsCalculator.calculateAdvStatistics(statisticsMock).postPerUsers;
        double commentsPerUser = statisticsCalculator.calculateAdvStatistics(statisticsMock).commentsPerUser;
        double commentsPerPost = statisticsCalculator.calculateAdvStatistics(statisticsMock).commentsPerPost;

        //Then
        assertEquals(0.03, postPerUsers);
        assertEquals(0.04, commentsPerUser);
        assertEquals(1.33, commentsPerPost, 0.01);
    }

}
