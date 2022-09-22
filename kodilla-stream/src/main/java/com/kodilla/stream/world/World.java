package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    List<Continent> listOfContinent = new ArrayList<>();

    public void addContinent(Continent continent){
        listOfContinent.add(continent);
    }

    public int getNumberOfContinents(){
        return listOfContinent.size();
    }

    public BigDecimal getPeopleQuantity(){
        return listOfContinent.stream()
                .flatMap(user -> user.getCountry().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
