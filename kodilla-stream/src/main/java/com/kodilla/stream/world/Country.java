package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {

    public String countryName;
    public BigDecimal quantity;

    public Country(String countryName, BigDecimal quantity) {
        this.countryName = countryName;
        this.quantity = quantity;
    }

    public String getCountryName() {
        return countryName;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }
}