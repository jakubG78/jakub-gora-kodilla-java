package com.kodilla.good.patterns.challenges.airline;

import java.util.ArrayList;

public class FlightReposiotry {

    private ArrayList<Flight> repository = new ArrayList<>();

    public FlightReposiotry() {
        Flight gdanskToPoznan = new Flight(Airport.GDANSK, Airport.POZNAN);
        Flight gdanskToWarszawa = new Flight(Airport.GDANSK, Airport.WARSZAWA);
        Flight poznanToWroclaw = new Flight(Airport.POZNAN, Airport.WROCLAW);
        Flight poznanToWarszawa = new Flight(Airport.POZNAN, Airport.WARSZAWA);
        Flight warszawaToGdansk = new Flight(Airport.WARSZAWA, Airport.GDANSK);
        Flight warszawaToPoznan = new Flight(Airport.WARSZAWA, Airport.POZNAN);
        Flight warszawaToWroclaw = new Flight(Airport.WARSZAWA, Airport.WROCLAW);
        Flight wroclawToGdansk = new Flight(Airport.WROCLAW, Airport.GDANSK);
        Flight wroclawToWarszawa = new Flight(Airport.WROCLAW, Airport.WARSZAWA);
        repository.add(gdanskToPoznan);
        repository.add(gdanskToWarszawa);
        repository.add(poznanToWroclaw);
        repository.add(poznanToWarszawa);
        repository.add(warszawaToGdansk);
        repository.add(warszawaToPoznan);
        repository.add(warszawaToWroclaw);
        repository.add(wroclawToGdansk);
        repository.add(wroclawToWarszawa);
    }

    public ArrayList<Flight> getRepository() {
        return repository;
    }
}
