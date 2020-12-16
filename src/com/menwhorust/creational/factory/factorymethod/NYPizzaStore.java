package com.menwhorust.creational.factory.factorymethod;

public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        if(type.equals("cheese"))
            return new NYStyleCheesePizza();
        else
            return null;
    }
}
