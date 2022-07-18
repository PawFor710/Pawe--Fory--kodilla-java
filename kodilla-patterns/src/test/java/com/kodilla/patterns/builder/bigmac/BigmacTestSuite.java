package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("brioche")
                .sauce("barbecue")
                .burgers(5)
                .ingredients("onion")
                .ingredients("tomato")
                .ingredients("cheese")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        String whatBun = bigmac.getBun();
        //Then
        assertEquals(howManyIngredients, 3);
        assertEquals(whatBun, "brioche");

    }
}
