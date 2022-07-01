package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class Continent {

    private final String nameOfContinent;

    public Continent(String nameOfContinent) {
        this.nameOfContinent = nameOfContinent;
    }

    public String getNameOfContinent() {
        return nameOfContinent;
    }

    public List<Country> getCountriesOfEurope() {
        List<Country> europe = new ArrayList<>();
        europe.add(new Country("Poland", new BigDecimal("1000")));
        europe.add(new Country("Italy", new BigDecimal("1000")));
        europe.add(new Country("Spain", new BigDecimal("1000")));
        return europe;
    }
    public List<Country> getCountriesOfAsia() {
        List<Country> asia = new ArrayList<>();
        asia.add(new Country("China", new BigDecimal("1439323776")));
        asia.add(new Country("India", new BigDecimal("1380004385")));
        asia.add(new Country("Indonesia", new BigDecimal("273523615")));
        return asia;
    }
    public List<Country> getCountriesOfAfrica() {
        List<Country> africa = new ArrayList<>();
        africa.add(new Country("Nigeria", new BigDecimal("206139589")));
        africa.add(new Country("Ethiopia", new BigDecimal("114963588")));
        africa.add(new Country("Egypt", new BigDecimal("102334404")));
        return africa;
    }
}