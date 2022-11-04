package com.kodilla.good.patterns.flight_finder;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Airport {
    private final String name;
    private final Set<Airport> departuresTo = new HashSet<>();

    public Airport(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Airport> getDeparturesTo() {
        return departuresTo;
    }

    public void addAirportToDepartureList(Airport airport) {
        departuresTo.add(airport);
    }

    @Override
    public String toString() {
        return "Lotnisko w " + this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Airport airport = (Airport) o;

        return Objects.equals(this.name, airport.getName());
    }

    @Override
    public int hashCode() {
        return this.name != null ? this.name.hashCode() : 0;
    }
}
