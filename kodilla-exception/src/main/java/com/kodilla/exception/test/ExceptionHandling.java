package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(1.1, 1.6);
        } catch (Exception e) {
            System.out.println("Something went wrong, please change your arguments");
        } finally {
            System.out.println("That's the end of method!");
        }
    }
}
