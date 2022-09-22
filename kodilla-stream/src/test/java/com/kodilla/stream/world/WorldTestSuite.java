package com.kodilla.stream.world;

import org.junit.jupiter.api.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity(){
        Continent europa = new Continent();
        Country poland = new Country("3817972527176276427000");
        Country denmark = new Country("18674613543");
        Country germany = new Country("78959531387651684693464468");

        europa.addCountry(poland);
        europa.addCountry(denmark);
        europa.addCountry(germany);

        Continent america = new Continent();
        Country usa = new Country("9761321568434");
        Country kanada = new Country("13546");

        america.addCountry(usa);
        america.addCountry(kanada);

        Continent asia = new Continent();
        Country rosia = new Country("8761384313");
        Country china = new Country("7864138434638464343684");
        Country india = new Country("876435138434");
        Country japan = new Country("798611551233564");

        asia.addCountry(rosia);
        asia.addCountry(china);
        asia.addCountry(india);
        asia.addCountry(japan);

        World world =new World();

        world.addContinent(europa);
        world.addContinent(america);
        world.addContinent(asia);

        BigDecimal numberOfPeopleInTheWorld = world.getPeopleQuantity();
        BigDecimal expectedNumberOfPeople = new BigDecimal("78971213499422776178186986");

        assertEquals(3, world.getNumberOfContinents());
        assertEquals(expectedNumberOfPeople,numberOfPeopleInTheWorld);


    }
}
