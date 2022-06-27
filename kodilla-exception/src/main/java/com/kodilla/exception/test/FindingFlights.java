package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindingFlights {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightFinder = new HashMap<>();
        flightFinder.put("Ciampino", true);
        flightFinder.put("Stansted", false);
        flightFinder.put("Luton", true);
        flightFinder.put("Monachium", true);

        if (flightFinder.containsKey(flight.getArrivalAirport())) {
            if (Boolean.FALSE.equals(flightFinder.get(flight.getArrivalAirport()))) {
                System.out.println("The arrival airport is busy!");
            } else {
                System.out.println("Let's fly!" + "\nfrom: " + flight.getDepartureAirport() +
                        "\nto: " + flight.getArrivalAirport());
            }
        } else {
            throw new RouteNotFoundException("This airport does not exist!");
        }
    }
}
