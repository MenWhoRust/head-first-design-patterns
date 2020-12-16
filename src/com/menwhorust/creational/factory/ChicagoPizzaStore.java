package com.menwhorust.creational.factory;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String type) {
        if(type.equals("cheese"))
            return new ChicagoStyleCheesePizza();
        return null;
    }
}
