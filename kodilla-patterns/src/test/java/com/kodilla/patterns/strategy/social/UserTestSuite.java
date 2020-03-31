package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User bob = new Millenials("Robert Lansky");
        User jim = new ZGeneration("James Norton");
        User ann = new YGeneration("Anna Broom");

        //When
        String bobSharesVia = bob.sharePost();
        System.out.println("Bob is " + bobSharesVia);
        String jimSharesVia = jim.sharePost();
        System.out.println("Jim is " + jimSharesVia);
        String annSharesVia = ann.sharePost();
        System.out.println("Ann is " + annSharesVia);

        //Then
        Assert.assertEquals("sharing via Twitter", bobSharesVia);
        Assert.assertEquals("sharing via Snapchat", jimSharesVia);
        Assert.assertEquals("sharing via Facebook", annSharesVia);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User bob = new Millenials("Robert Lansky");

        //When
        String bobSharesVia = bob.sharePost();
        System.out.println("Bob is " + bobSharesVia);
        bob.setSharingStrategy(new FacebookPublisher());
        bobSharesVia = bob.sharePost();
        System.out.println("After change Bob is " + bobSharesVia);

        //Then
        Assert.assertEquals("sharing via Facebook", bobSharesVia);
    }
}
