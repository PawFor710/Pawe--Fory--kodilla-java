package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User paul = new Millenials("Paul");
        User brian = new YGeneration("Brian");
        User michael = new ZGeneration("Michael");

        //When
        String paulPublisher = paul.sharePost();
        System.out.println("Paul is the biggest fan of " + paulPublisher);
        String brianPublisher = brian.sharePost();
        System.out.println("Brian is the biggest fan of " + brianPublisher);
        String michaelPublisher = michael.sharePost();
        System.out.println("Michael is the biggest fan of " + michaelPublisher);

        //Then
        assertEquals("TWITTER", paulPublisher);
        assertEquals("FACEBOOK", brianPublisher);
        assertEquals("SNAPCHAT", michaelPublisher);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User paul = new Millenials("Paul");

        //When
        String paulPublisher = paul.sharePost();
        System.out.println("Paul is the biggest fan of " + paulPublisher);
        paul.setSocialPublisher(new SnapchatPublisher());
        paulPublisher = paul.sharePost();
        System.out.println("Paul is the biggest fan of " + paulPublisher);

        //Then
        assertEquals("SNAPCHAT", paulPublisher);
    }
}
