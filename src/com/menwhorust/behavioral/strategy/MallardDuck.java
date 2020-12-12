package com.menwhorust.behavioral.strategy;

public class MallardDuck extends Duck {
    MallardDuck(){
        this.flyBehaviour = new FlyWithWings();
        this.quackBehaviour = new OrganicQuack();
    }
}
