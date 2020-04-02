package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigmacBuilder(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("With sesame")
                .burgers(2)
                .sauce("Barbecue")
                .ingredient("Lettuce")
                .ingredient("Tomato")
                .ingredient("Onion")
                .ingredient("Hot pepper")
                .build();
        System.out.println(bigmac.toString());

        //When
        String bun = bigmac.getBun();
        int howManyBurgers = bigmac.getBurgers();
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        Assert.assertEquals("With sesame", bun);
        Assert.assertEquals(2, howManyBurgers);
        Assert.assertEquals(4, howManyIngredients);
    }
}
