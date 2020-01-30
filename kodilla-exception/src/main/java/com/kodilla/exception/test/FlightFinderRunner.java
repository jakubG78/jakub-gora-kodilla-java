package com.kodilla.exception.test;

public class FlightFinderRunner {
    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        Flight flight01 = new Flight("Los Angeles", "Detroit");
        Flight flight02 = new Flight("Detroit", "Nashville");
        Flight flight03 = new Flight("Detroit", "Seattle");

        try {
            System.out.println(flightFinder.findFilght(flight01));
            System.out.println(flightFinder.findFilght(flight02));
            System.out.println(flightFinder.findFilght(flight03));
        } catch (RouteNotFoundException e) {
            System.out.println("One of airports in route cannot be found!");
            //wrzuciłem też podgląd do konsoli zawartości informacji o błędzie
            System.out.println(e);
        } finally {
            System.out.println("Search ended.");
        }
    }
}
