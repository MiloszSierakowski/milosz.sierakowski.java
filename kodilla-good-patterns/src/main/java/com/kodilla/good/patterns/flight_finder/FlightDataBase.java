package com.kodilla.good.patterns.flight_finder;

import java.util.Set;

public class FlightDataBase {
    private final Set<Airport> availableFlights;

    public FlightDataBase(Set<Airport> availableFlights) {
        this.availableFlights = availableFlights;
    }

    public void addAirportToAvailableFlights(Airport airport) {
        availableFlights.add(airport);
    }

    public void removeAirportFromAvailableFlights(Airport airport) {
        availableFlights.remove(airport);
    }
    public Set<Airport> getAvailableFlights() {
        return availableFlights;
    }
}
