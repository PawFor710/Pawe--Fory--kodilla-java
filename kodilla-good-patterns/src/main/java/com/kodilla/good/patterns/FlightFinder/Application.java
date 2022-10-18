package com.kodilla.good.patterns.FlightFinder;

public class Application {

    public static void main(String[] args) {
        EveryRoutes everyRoutes = new EveryRoutes();

        everyRoutes.showEveryRouts();
        everyRoutes.showPossibleCity("Warsaw");
        everyRoutes.showConnectingFlights("Gdansk", "Krakow");
    }
}
