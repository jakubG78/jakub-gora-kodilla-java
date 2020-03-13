package com.kodilla.good.patterns.challenges.airline;

public class Flight {
    private Airport depatrureAirport;
    private Airport destinationAirport;

    public Flight(Airport depatrureAirport, Airport destinationAirport) {
        this.depatrureAirport = depatrureAirport;
        this.destinationAirport = destinationAirport;
    }

    public Airport getDestinationAirport() {
        return destinationAirport;
    }

    public Airport getDepatrureAirport() {
        return depatrureAirport;
    }

    @Override
    public String toString() {
        return "Flight from " + depatrureAirport +
                " to " + destinationAirport +
                ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (depatrureAirport != flight.depatrureAirport) return false;
        return destinationAirport == flight.destinationAirport;
    }

    @Override
    public int hashCode() {
        int result = depatrureAirport != null ? depatrureAirport.hashCode() : 0;
        result = 31 * result + (destinationAirport != null ? destinationAirport.hashCode() : 0);
        return result;
    }
}
