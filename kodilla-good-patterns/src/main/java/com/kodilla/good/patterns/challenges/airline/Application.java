package com.kodilla.good.patterns.challenges.airline;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        FlightFinderService flightFinderService = new FlightFinderService();

        List<Flight> result = flightFinderService.findFlightsFrom(Airport.WROCLAW);
        System.out.println(result);
        result = flightFinderService.flindDirectFlightsTo(Airport.WARSZAWA);
        System.out.println(result);
        result = flightFinderService.findInDirectFlightsFromTo(Airport.WROCLAW,Airport.WARSZAWA, Airport.GDANSK);
        System.out.println(result);
    }
}
