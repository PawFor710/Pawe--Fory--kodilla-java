package com.kodilla.good.patterns.FlightFinder;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EveryRoutes {

    EveryFlights everyFlights = new EveryFlights();

    public List<String> showEveryRouts() {

        List<String> departures = everyFlights.showListOfRouts().entrySet().stream()
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        return departures;
    }
}
