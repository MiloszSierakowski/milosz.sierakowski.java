package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FlightSearcherTests {

    @Test
    void findFilghtNullFlightTest(){
        Flight flight = null;
        FlightSearcher flightSearcher = new FlightSearcher();

        assertThrows(RouteNotFoundException.class,() -> flightSearcher.findFilght(flight));
    }

    @Test
    void findFilghtNotExistAirport(){
        Flight flight = new Flight("Gdansk" , "London");
        FlightSearcher flightSearcher = new FlightSearcher();

        assertThrows(RouteNotFoundException.class,() -> flightSearcher.findFilght(flight));
    }

    @Test
    void findFilghtExistAirport(){
        Flight flight = new Flight("Gdansk" , "Warsaw");
        FlightSearcher flightSearcher = new FlightSearcher();

        assertDoesNotThrow(() -> flightSearcher.findFilght(flight));
    }
}
