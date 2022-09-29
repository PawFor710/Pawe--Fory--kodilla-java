package com.kodilla.patterns2.decorator.pizza;

import com.kodilla.patterns2.decorator.pizza.ingredients.*;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class PizzaTestSuite {

    @Test
    public void testPizzaDecoratorGetCost() {
        //Given
        Pizza thePizza = new BasicPizza();
        thePizza = new SalamiDecorator(thePizza);
        thePizza = new CheeseDecorator(thePizza);
        thePizza = new OlivesDecorator(thePizza);
        thePizza = new AnchoisDecorator(thePizza);
        thePizza = new OliveOilDecorator(thePizza);
        //When
        BigDecimal thCost = thePizza.getCost();
        //Then
        assertEquals(new BigDecimal(30), thCost);
    }

    @Test
    public void testPizzaDecoratorGetIngredients() {
        //Given
        Pizza thePizza = new BasicPizza();
        thePizza = new SalamiDecorator(thePizza);
        thePizza = new CheeseDecorator(thePizza);
        thePizza = new OlivesDecorator(thePizza);
        thePizza = new AnchoisDecorator(thePizza);
        thePizza = new OliveOilDecorator(thePizza);
        //When
        String ingredients = thePizza.getIngredients();
        //Then
        assertEquals("Dough, tomato sauce, mozzarella" +
                        ", salami picante" +
                        ", pecorino romano" +
                        ", black olives" +
                        ", anchois" +
                        " + olive oil"
                ,ingredients);
    }
}
