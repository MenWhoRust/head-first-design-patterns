package com.menwhorust.structural.decorator;

import java.math.BigDecimal;

public class DarkRoast extends Beverage{
    DarkRoast(){
        description = "Dark Roast Coffee";
    }
    @Override
    public BigDecimal cost() {
        return BigDecimal.valueOf(2);
    }
}
