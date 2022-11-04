package com.kodilla.good.patterns.flight_finder;

import java.util.HashSet;
import java.util.Set;

public class InputData {
    public Set<Airport> airportsList() {
        Airport airport = new Airport(AirportName.GDANS.name());
        Airport airport1 = new Airport(AirportName.SZCZECIN.name());
        Airport airport2 = new Airport(AirportName.OLSZTYN.name());
        Airport airport3 = new Airport(AirportName.WARSZAWA.name());


        airport.addAirportToDepartureList(airport1);
        airport.addAirportToDepartureList(airport3);
        airport.addAirportToDepartureList(airport2);

        airport1.addAirportToDepartureList(airport);
        airport1.addAirportToDepartureList(airport3);

        airport2.addAirportToDepartureList(airport3);

        airport3.addAirportToDepartureList(airport);
        airport3.addAirportToDepartureList(airport1);
        airport3.addAirportToDepartureList(airport2);

        Set<Airport> airports = new HashSet<>();

        airports.add(airport);
        airports.add(airport1);
        airports.add(airport2);
        airports.add(airport3);

        return airports;
    }
}
