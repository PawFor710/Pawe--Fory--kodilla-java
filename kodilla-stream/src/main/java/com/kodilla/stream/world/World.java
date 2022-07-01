package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
public List<Continent> getContinents() {
    List<Continent> continents = new ArrayList<>();
    continents.add(new Continent("Europe"));
    continents.add(new Continent("Asia"));
    continents.add(new Continent("Africa"));

    return continents;
}

    public BigDecimal getPeopleQuantity() {

        BigDecimal quantityOfEurope = getContinents().stream()
                .flatMap(euro -> euro.getCountriesOfEurope().stream())
                .map(Country::getQuantity)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        BigDecimal quantityOfAsia = getContinents().stream()
                .flatMap(asia -> asia.getCountriesOfAsia().stream())
                .map(Country::getQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        BigDecimal quantityOfAfrica = getContinents().stream()
                .flatMap(africa -> africa.getCountriesOfAfrica().stream())
                .map(Country::getQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        return quantityOfEurope;
    }
}