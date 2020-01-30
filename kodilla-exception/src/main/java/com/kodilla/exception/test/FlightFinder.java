package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightFinder {
    public boolean findFilght(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> flightsMap = new HashMap<>();
        flightsMap.put("Chicago", true);
        flightsMap.put("Toronto", true);
        flightsMap.put("Los Angeles", false);
        flightsMap.put("Detroit", true);
        flightsMap.put("Boulder", false);
        flightsMap.put("Las Vegas", false);
        flightsMap.put("Nashville", true);
        if(flight.getDepartureAirport()!= null && flightsMap.get(flight.getArrivalAirport())!= null) {
            return flightsMap.get(flight.getDepartureAirport()) && flightsMap.get(flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException("One of the airports in route not found on current flight map");
        }
    }
}
