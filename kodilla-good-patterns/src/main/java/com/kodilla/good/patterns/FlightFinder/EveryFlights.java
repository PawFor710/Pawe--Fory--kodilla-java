package com.kodilla.good.patterns.FlightFinder;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EveryFlights {

    public Set<Flight> listOfRouts() {

        Flight fromGdanskToWroclaw = new Flight("Gdansk", "Wroclaw");
        Flight fromWroclawToGdansk = new Flight("Wroclaw", "Gdansk");

        Flight fromKrakowToWarsaw = new Flight("Krakow", "Warsaw");
        Flight fromWarsawToKrakow= new Flight("Warsaw", "Krakow");

        Flight fromWarsawToWroclaw = new Flight("Warsaw", "Wroclaw");
        Flight fromWroclawToWarsaw = new Flight("Wroclaw", "Warsaw");

        Flight fromWroclawToKrakow = new Flight("Wroclaw", "Krakow");
        Flight fromKrakowToWroclaw = new Flight("Krakow", "Wroclaw");

        Set<Flight> routs = new HashSet<>();

        routs.add(fromGdanskToWroclaw);
        routs.add(fromWroclawToGdansk);

        routs.add(fromKrakowToWarsaw);
        routs.add(fromWarsawToKrakow);

        routs.add(fromWarsawToWroclaw);
        routs.add(fromWroclawToWarsaw);

        routs.add(fromWroclawToKrakow);
        routs.add(fromKrakowToWroclaw);

        return routs;
    }
}
