package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    List<Country> listOfCountry = new ArrayList<>();

    public void addCountry(Country country){
        listOfCountry.add(country);
    }

    public List<Country> getCountry(){
        return listOfCountry;
    }
}
