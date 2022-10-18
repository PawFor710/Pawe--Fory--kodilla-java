package com.kodilla.good.patterns.FlightFinder;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;

public class Flight {

    private final String departure;

    private final String arrive;

    public Flight(String departure, String arrive) {
        this.departure = departure;
        this.arrive = arrive;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrive() {
        return arrive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(departure, flight.departure) && Objects.equals(arrive, flight.arrive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departure, arrive);
    }
}
