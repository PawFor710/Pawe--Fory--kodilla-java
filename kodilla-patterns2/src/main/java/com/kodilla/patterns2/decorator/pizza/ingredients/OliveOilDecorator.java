package com.kodilla.patterns2.decorator.pizza.ingredients;

import com.kodilla.patterns2.decorator.pizza.AbstractPizzaDecorator;
import com.kodilla.patterns2.decorator.pizza.Pizza;

import java.math.BigDecimal;

public class OliveOilDecorator extends AbstractPizzaDecorator {

    public OliveOilDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(1));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + " + olive oil";
    }
}
