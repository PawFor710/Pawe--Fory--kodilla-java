package com.kodilla.good.patterns.FlightFinder;

import java.util.HashMap;
import java.util.Map;

public class EveryFlights {

    private final Departures departures;
    private final Arrive arrive;


    public EveryFlights(Arrive arrive, Departures departures) {
        this.arrive = arrive;
        this.departures = departures;
    }

    public Arrive getArrive() {
        return arrive;
    }

    public Departures getDepartures() {
        return departures;
    }

    public Map<Departures, Arrive> showListOfRouts() {

        Departures fromGdansk = new Departures("Gdansk");
        Departures fromKrakow = new Departures("Krakow");
        Departures fromWarszawa = new Departures("Warszawa");
        Departures fromWroclaw = new Departures("Wroclaw");

        Arrive toWroclaw = new Arrive("Wroclaw");
        Arrive toGdansk = new Arrive("Gdans");
        Arrive toWarszawa = new Arrive("Warszawa");
        Arrive toKrakow = new Arrive("Krakow");


        Map<Departures, Arrive> routs = new HashMap<>();
        routs.put(fromGdansk, toWroclaw);
        routs.put(fromKrakow, toWarszawa);
        routs.put(fromWarszawa, toWroclaw);
        routs.put(fromWroclaw, toKrakow);
        routs.put(fromWarszawa, toGdansk);

        return routs;
    }

    @Override
    public String toString() {
        return "You can fly from: " + departures + " to: " + arrive;
    }
}
