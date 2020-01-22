package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        World earth = new World();

        Continent theEurope = new Continent("Europe");
        Country theFrance = new Country("18012587");
        Country theEngland = new Country("14850213");
        Country theSpain = new Country("29801589");
        Country theNetherlands = new Country("11089541");
        theEurope.addCountry(theFrance);
        theEurope.addCountry(theEngland);
        theEurope.addCountry(theSpain);
        theEurope.addCountry(theNetherlands);

        Continent theAsia = new Continent("Asia");
        Country theChina = new Country("130851250");
        Country theIndia = new Country("126851250");
        theAsia.addCountry(theChina);
        theAsia.addCountry(theIndia);

        Continent theAfrica = new Continent("Africa");
        Country theGhana = new Country("5085059");
        Country theRSA = new Country("12508901");
        Country theEgypt = new Country("6589642");
        theAfrica.addCountry(theGhana);
        theAfrica.addCountry(theRSA);
        theAfrica.addCountry(theEgypt);

        Continent theNrdAmerica = new Continent("Nord America");
        Country theUSA = new Country("50894135");
        Country theCanada = new Country("30568970");
        Country theMexico = new Country("90289310");
        theNrdAmerica.addCountry(theUSA);
        theNrdAmerica.addCountry(theCanada);
        theNrdAmerica.addCountry(theMexico);

        Continent theSthAmerica = new Continent("South America");
        Country theBrazil = new Country("99800781");
        Country theArgentina = new Country("32050897");
        theSthAmerica.addCountry(theBrazil);
        theSthAmerica.addCountry(theArgentina);

        Continent theAustralia = new Continent("Australia");
        Country australia = new Country("24895115");
        theAustralia.addCountry(australia);

        Continent theArctic = new Continent("Arctic");
        Country arctic = new Country("1106");
        theArctic.addCountry(arctic);

        earth.addContinent(theEurope);
        earth.addContinent(theAsia);
        earth.addContinent(theAfrica);
        earth.addContinent(theNrdAmerica);
        earth.addContinent(theSthAmerica);
        earth.addContinent(theAustralia);
        earth.addContinent(theArctic);

        //When
        BigDecimal totalPeopleQuantity;
        totalPeopleQuantity = earth.getPeopleQuantity();

        //Then
        BigDecimal expectedPeopleQuantity = new BigDecimal("684140346");
        Assert.assertEquals(expectedPeopleQuantity,totalPeopleQuantity);
    }
}
