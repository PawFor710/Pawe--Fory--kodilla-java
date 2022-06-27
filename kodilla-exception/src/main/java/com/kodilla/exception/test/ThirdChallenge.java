package com.kodilla.exception.test;

public class ThirdChallenge {

    public static void main(String[] args) {

        FindingFlights findingFlights = new FindingFlights();

        try {
            findingFlights.findFlight(new Flight("Modlin", "Stansted"));
        } catch (RouteNotFoundException e) {
            System.out.println("ERROR!" + "\nYou have to choose other arrival airport");
        }
    }
}
