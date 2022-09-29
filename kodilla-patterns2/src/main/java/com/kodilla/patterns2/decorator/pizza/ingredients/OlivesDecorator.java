package com.kodilla.patterns2.decorator.pizza.ingredients;

import com.kodilla.patterns2.decorator.pizza.AbstractPizzaDecorator;
import com.kodilla.patterns2.decorator.pizza.Pizza;

import java.math.BigDecimal;

public class OlivesDecorator extends AbstractPizzaDecorator {

    public OlivesDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", black olives";
    }
}
