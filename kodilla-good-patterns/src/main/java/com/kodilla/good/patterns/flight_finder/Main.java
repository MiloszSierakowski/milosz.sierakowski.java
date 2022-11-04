package com.kodilla.good.patterns.flight_finder;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        InputData inputData = new InputData();
        FlightDataBase flightDataBase = new FlightDataBase(inputData.airportsList());
        FlightFinder flightFinder = new FlightFinder(flightDataBase.getAvailableFlights());

        Airport airportSearched = new Airport(AirportName.OLSZTYN.name());
        List<String> departureFromAirport = flightFinder.getDeparturesFromAirport(airportSearched);

        System.out.println("Z " + airportSearched + " wylatują samoloty do mniejscowości ");

        for (String a : departureFromAirport) {
            System.out.println(a);
        }

        List<String> arrivalsToAirport = flightFinder.getArrivalsToAirport(airportSearched);

        System.out.println("\nDo " + airportSearched + " przylatują samoloty z mniejscowości ");

        for (String s : arrivalsToAirport) {
            System.out.println(s);
        }

        System.out.println("\n");
        Airport fromAirport = new Airport(AirportName.SZCZECIN.name());
        Airport toAirport = new Airport(AirportName.OLSZTYN.name());

        String flightFromTo = flightFinder.getFlightFromTo(fromAirport, toAirport);

        System.out.println(flightFromTo);
    }
}
