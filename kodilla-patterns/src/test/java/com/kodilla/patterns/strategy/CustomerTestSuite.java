package com.kodilla.patterns.strategy;

import com.kodilla.patterns.strategy.predictors.AggressivePredictor;
import org.junit.Assert;
import org.junit.Test;

public class CustomerTestSuite {

    @Test
    public void testDefaultInvestingStrategies() {
        //Given
        Customer stev = new IndividualCustomer("Steven Lansky");
        Customer bob = new IndividualYoungCustomer("Robert DuVal");
        Customer kodilla = new CorporateCustomer("Kodilla World Inc.");

        //When
        String stevShouldBuy = stev.predict();
        System.out.println("Steven should: " + stevShouldBuy);
        String bobShouldBuy = bob.predict();
        System.out.println("Bob should: " + bobShouldBuy);
        String kodillaShouldBuy = kodilla.predict();
        System.out.println("Kodilla should: " + kodillaShouldBuy);

        //Then
        Assert.assertEquals("[Conservative predictor] Buy debentures of XYZ", stevShouldBuy);
        Assert.assertEquals("[Aggressive predictor] Buy stock of XYZ", bobShouldBuy);
        Assert.assertEquals("[Balanced predictor] Buy shared units of Fund XYZ", kodillaShouldBuy);
    }

    @Test
    public void testIndividualInvestingStrategy() {
        //Given
        Customer stev = new IndividualCustomer("Steven Lansky");

        //When
        String stevShouldBuy = stev.predict();
        System.out.println("Steven should: " + stevShouldBuy);
        stev.setBuyingStrategy(new AggressivePredictor());
        stevShouldBuy = stev.predict();
        System.out.println("Steven now should: " + stevShouldBuy);

        //Then
        Assert.assertEquals("[Aggressive predictor] Buy stock of XYZ", stevShouldBuy);
    }
}
