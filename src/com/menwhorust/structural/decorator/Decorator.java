package com.menwhorust.structural.decorator;

public class Decorator {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();

        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage darkRoast = new DarkRoast();

        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);

        System.out.println(darkRoast.getDescription() + " $" + darkRoast.cost());


    }
}
