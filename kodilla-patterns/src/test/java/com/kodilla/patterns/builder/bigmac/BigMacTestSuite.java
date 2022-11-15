package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BigMacTestSuite {

    @Test
    void testBigMacNew() {

        BigMac bigMac = new BigMac.BigMacBuilder()
                .bun("z sezamem")
                .burgers(2)
                .sauce("Barbecue")
                .ingredients(Ingredient.CHEESE)
                .ingredients(Ingredient.CHEESE)
                .ingredients(Ingredient.BACON)
                .ingredients(Ingredient.ONION)
                .build();

        System.out.println(bigMac);

        int howManyIngredients = bigMac.getIngredients().size();

        assertEquals(4, howManyIngredients);
    }
}
