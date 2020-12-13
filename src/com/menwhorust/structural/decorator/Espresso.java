package com.menwhorust.structural.decorator;

import java.math.BigDecimal;

public class Espresso extends Beverage {
    Espresso(){
        description = "Espresso";
    }
    @Override
    public BigDecimal cost() {
        return BigDecimal.valueOf(1.99);
    }
}
