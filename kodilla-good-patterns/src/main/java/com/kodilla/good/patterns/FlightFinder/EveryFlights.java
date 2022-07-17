package com.kodilla.good.patterns.FlightFinder;

import java.util.HashMap;
import java.util.Map;

public class EveryFlights {

    public Map<String, String> showListOfRouts() {

        Map<String, String> routs = new HashMap<>();
        routs.put("Gdansk", "Wroclaw");
        routs.put("Krakow", "Warszawa");
        routs.put("Warszawa", "Wroclaw");
        routs.put("Wroclaw", "Krakow");
        routs.put("Warszawa", "Gdansk");

        return routs;
    }
}
