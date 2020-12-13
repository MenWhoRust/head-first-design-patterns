package com.menwhorust.structural.decorator;

import java.math.BigDecimal;

public class HouseBlend extends Beverage {
    HouseBlend(){
        description = "House Blend Coffee";
    }

    @Override
    public BigDecimal cost() {
        return BigDecimal.valueOf(.89);
    }
}
