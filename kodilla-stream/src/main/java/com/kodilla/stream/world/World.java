package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

    Continent europe = new Continent("Europe", List.of(
            new Country("Poland", new BigDecimal("37846611")),
            new Country("Italy", new BigDecimal("60461826")),
            new Country("Spain", new BigDecimal("46754778"))));

    Continent asia = new Continent("Asia", List.of(
            new Country("China", new BigDecimal("1439323776")),
            new Country("India", new BigDecimal("1380004385")),
            new Country("Indonesia", new BigDecimal("273523615"))));

    Continent africa = new Continent("Africa", List.of(
            new Country("Nigeria", new BigDecimal("206139589")),
            new Country("Ethiopia", new BigDecimal("114963588")),
            new Country("Egypt", new BigDecimal("102334404"))));

    List<Continent> listOfContinents = new ArrayList<>();


    public BigDecimal getPeopleQuantity() {
        listOfContinents.add(europe);
        listOfContinents.add(asia);
        listOfContinents.add(africa);

        BigDecimal quantity = listOfContinents.stream()
                .flatMap(world -> world.getCountries().stream())
                .map(Country::getQuantity)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        return quantity;
    }
}