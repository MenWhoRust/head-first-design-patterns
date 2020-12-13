package com.menwhorust.structural.decorator;

public class Decorator {
    // With the decorator patter you can attach
    // additional responsibilities to an object dynamically
    // The main idea is to wrap related object within one
    // another and add the additional functionality within the wrapper
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
