package com.kodilla.exception.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightSearcher {

    public void findFilght(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightDataBase = new HashMap<>();
        flightDataBase.put("Warsaw", true);
        flightDataBase.put("Amsterdam", true);
        flightDataBase.put("New York", true);
        flightDataBase.put("Moscow", false);
        flightDataBase.put("Abuja", false);
        flightDataBase.put("Bogota", false);
        boolean flightExist = false;

        if (flight != null) {
            for (Map.Entry<String, Boolean> entry : flightDataBase.entrySet()) {
                if (entry.getKey().equals(flight.getArrivalAirport())) {
                    flightExist = true;
                    if (entry.getValue()) {
                        System.out.println("Wyszukiwane lotnisko jest dostepne dla podruznych " + flight.getArrivalAirport());
                    } else {
                        System.out.println("Wyszukiwane lotnisko nie jest dostepne dla podruznych " + flight.getArrivalAirport());
                    }
                }
            }
        }

        if (!flightExist) {
            throw new RouteNotFoundException();
        }

    }

    public static void main(String[] args) {
        Flight flight = new Flight("Gdansk", "Warsaw");
        Flight flight1 = new Flight("Gdansk", "Moscow");
        Flight flight2 = new Flight("Gdansk", "Cracow");
        List<Flight> flights = new ArrayList<>();
        flights.add(flight);
        flights.add(flight1);
        flights.add(flight2);

        FlightSearcher flightSearcher = new FlightSearcher();

        for (Flight temporaryFlight : flights) {
            try {
                flightSearcher.findFilght(temporaryFlight);
            } catch (RouteNotFoundException e) {
                System.out.println("W bazie danych nie ma lotniska o podanej nazwie ");
            } finally {
                System.out.println("Dziekujemy za skorzystanie z naszej wyszukiwarki lotow \n");
            }
        }

    }
}
