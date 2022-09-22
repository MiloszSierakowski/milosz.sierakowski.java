package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final BigDecimal peopleQuantity;

    public Country(String numberOfPeople) {
        peopleQuantity = new BigDecimal(numberOfPeople);
    }

    public BigDecimal getPeopleQuantity(){
        return peopleQuantity;
    }
}
