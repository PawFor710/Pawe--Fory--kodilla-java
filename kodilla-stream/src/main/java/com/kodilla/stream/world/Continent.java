package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class Continent {

    private final String nameOfContinent;
    private final List<Country> listOfCountry;

    public Continent(String nameOfContinent, List<Country> listOfCountry) {
        this.nameOfContinent = nameOfContinent;
        this.listOfCountry = listOfCountry;
    }

    public String getNameOfContinent() {
        return nameOfContinent;
    }

    public List<Country> getCountries() {
        return listOfCountry;
    }
}