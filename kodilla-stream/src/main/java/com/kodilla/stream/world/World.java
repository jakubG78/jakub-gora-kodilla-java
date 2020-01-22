package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    List<Continent> theWorld = new ArrayList<>();

    public void addContinent(Continent theContinent){
        theWorld.add(theContinent);
    }
    public boolean removeContinent(Continent theContinent){
        return theWorld.remove(theContinent);
    }

    public BigDecimal getPeopleQuantity(){
        return theWorld.stream()
                .flatMap(continent -> continent.getTheContinent().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current)-> sum = sum.add(current));
    }
}