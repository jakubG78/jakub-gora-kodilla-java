package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {

    private final BigDecimal peopleQuantity;

    public Country(String peopleImput) {
        peopleQuantity = new BigDecimal(peopleImput);
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }
}
