package com.kodilla.good.patterns.challenges.airline;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlightFinderService {
    private FlightReposiotry flightReposiotry = new FlightReposiotry();

    public List findFlightsFrom(Airport departureAirport) {
        System.out.println("Creating list of flights form: " + departureAirport + "\n");
        List<Flight> resultFlightsList = flightReposiotry.getRepository().stream()
                .filter(entry -> entry.getDepatrureAirport() == departureAirport)
                .collect(Collectors.toList());
        return resultFlightsList;
    }

    public List flindDirectFlightsTo(Airport destinationAirport) {
        System.out.println("Creating list of direct flight to: " + destinationAirport + "\n");
        List<Flight> resultFlightsList = flightReposiotry.getRepository().stream()
                .filter(entry -> entry.getDestinationAirport() == destinationAirport)
                .collect(Collectors.toList());
        return resultFlightsList;
    }

    public List findInDirectFlightsFromTo(Airport departureAirport, Airport transferAirport, Airport destinationAirport) {
        System.out.println("List of indirect flights from " + departureAirport + " via " + transferAirport + " to " + destinationAirport);
        Stream<Flight> transferFlightsStream = flightReposiotry.getRepository().stream()
                .filter(entry -> entry.equals(new Flight(departureAirport, transferAirport)));
        Stream<Flight> arrivalFlightStream = flightReposiotry.getRepository().stream()
                .filter(entry -> entry.equals(new Flight(transferAirport, destinationAirport)));
        List<Flight> resultFlighList = Stream.concat(transferFlightsStream, arrivalFlightStream)
                .collect(Collectors.toList());
        return resultFlighList;
    }
}
