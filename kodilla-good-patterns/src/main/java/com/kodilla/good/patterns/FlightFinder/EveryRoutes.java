package com.kodilla.good.patterns.FlightFinder;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EveryRoutes {
    EveryFlights everyFlights = new EveryFlights();


    public void showEveryRouts() {

        System.out.println("Here's available routs: ");

        for (Flight routs : everyFlights.listOfRouts()) {

            System.out.println("Departure airport: " + routs.getDeparture()
                    + "|  Arrive airport: " + routs.getArrive());
        }
    }

    public List<String> showPossibleCity(String departureAirport) {

        return everyFlights.listOfRouts().stream()
                .filter(arrive -> arrive.getDeparture().equals(departureAirport))
                .map(Flight::getArrive)
                .collect(Collectors.toList());
    }

    public void showConnectingFlights(String departureAirport, String arriveAirport) {

        List<String> arrive = showPossibleCity(departureAirport);

        List<String> departure = everyFlights.listOfRouts().stream()
                        .filter(n -> n.getArrive().equals(arriveAirport))
                                .map(Flight::getDeparture)
                                        .collect(Collectors.toList());

        List<String> connecting = new ArrayList<>();
        for (String departureAirports : departure) {
            for (String arriveAirports : arrive) {
                if (arriveAirports.contains(departureAirports)) {
                    connecting.add(arriveAirports);
                }
            }
        }
        System.out.println("Here's list of connecting airports: ");

        for (String airports : connecting) {
            System.out.println(airports);
        }
    }
}

