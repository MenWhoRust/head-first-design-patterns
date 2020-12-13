package com.menwhorust.structural.decorator;

import java.math.BigDecimal;

public class Mocha extends CondimentDecorator {
    Beverage beverage;
    Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public BigDecimal cost() {
        return beverage.cost().add(BigDecimal.valueOf(.20));
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
