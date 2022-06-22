package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
Continent continent = new Continent();
    public List<String> getContinents() {
        List<String> continents = new ArrayList<>();
        continents.add("Europe");
        continents.add("Asia");
        continents.add("Africa");
        return continents;
    }

    public void getQuantityOfPeople() {
        Country country = new Country();
        Continent continent = new Continent();
        BigDecimal totalQuantity = (BigDecimal) getContinents().stream();



    }
}
