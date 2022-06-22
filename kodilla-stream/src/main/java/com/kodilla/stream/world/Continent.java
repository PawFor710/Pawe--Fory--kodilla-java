package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class Continent {
    Country country = new Country();

    public List<BigDecimal> getCountriesOfEurope() {
        List<BigDecimal> europe = new ArrayList<>();
        europe.add(country.getPeopleQuantityOfPoland());
        europe.add(country.getPeopleQuantityOfItaly());
        europe.add(country.getPeopleQuantityOfSpain());
        return europe;
    }
    public List<BigDecimal> getCountriesOfAsia() {
        List<BigDecimal> asia = new ArrayList<>();
        asia.add(country.getPeopleQuantityOfChina());
        asia.add(country.getPeopleQuantityOfIndia());
        asia.add(country.getPeopleQuantityOfIndonesia());
        return asia;
    }
    public List<BigDecimal> getCountriesOfAfrica() {
        List<BigDecimal> africa = new ArrayList<>();
        africa.add(country.getPeopleQuantityOfNigeria());
        africa.add(country.getPeopleQuantityOfEthiopia());
        africa.add(country.getPeopleQuantityOfEgypt());
        return africa;
    }
}