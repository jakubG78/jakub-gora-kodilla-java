package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    List<Country> theContinent = new ArrayList<>();
    private final String continentName;

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public void addCountry(Country theCountry){
        theContinent.add(theCountry);
    }

    public boolean removeCountry(Country theCountry){
        return theContinent.remove(theCountry);
    }

    public List<Country> getTheContinent() {
        return theContinent;
    }
}
