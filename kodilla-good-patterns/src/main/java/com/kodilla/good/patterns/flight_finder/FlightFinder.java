package com.kodilla.good.patterns.flight_finder;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightFinder {
    private final Set<Airport> airports;

    public FlightFinder(Set<Airport> airports) {
        this.airports = airports;
    }

    public List<String> getDeparturesFromAirport(Airport airport) {
        return this.airports.stream()
                .filter(airport::equals)
                .flatMap(x -> x.getDeparturesTo().stream())
                .map(Airport::getName)
                .collect(Collectors.toList());
    }

    public List<String> getArrivalsToAirport(Airport airport) {
        return this.airports.stream()
                .filter(x -> x.getDeparturesTo().contains(airport))
                .map(Airport::getName)
                .collect(Collectors.toList());
    }

    public String getFlightFromTo(Airport fromAirport, Airport toAirport) {
        boolean directFlight = this.airports.stream()
                .filter(x -> x.equals(fromAirport))
                .anyMatch(x -> x.getDeparturesTo().contains(toAirport));
        if (directFlight) {
            return "Istnieje połączenie bezpośrednie z " + fromAirport + " do " + toAirport;
        } else {
            String connectInAirport = this.airports.stream()
                    .filter(x -> x.equals(fromAirport))
                    .flatMap(x -> x.getDeparturesTo().stream())
                    .filter(x -> x.getDeparturesTo().contains(toAirport))
                    .map(Airport::getName)
                    .collect(Collectors.joining("\n"));

            return "Wyszukiwany lot z " + fromAirport.getName() + " do " + toAirport.getName() + " nie ma połączenia bezpośredniego" +
                    " za to proponujemy lot z przesiadką przez lotnisko w :\n" + connectInAirport;
        }
    }
}
