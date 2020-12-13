package com.menwhorust.structural.decorator;

import java.math.BigDecimal;

public class Whip extends CondimentDecorator {
    private Beverage beverage;

    Whip(Beverage beverage){
       this.beverage = beverage;
    }

    @Override
    public BigDecimal cost() {
        return beverage.cost().add(BigDecimal.valueOf(.15)) ;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
