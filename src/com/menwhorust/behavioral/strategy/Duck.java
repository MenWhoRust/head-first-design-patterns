package com.menwhorust.behavioral.strategy;

public abstract class Duck {
    // We encapsulate our behaviours into interface
    // Now we are not locked into a concrete implementation
    // of the Quack() and Fly() methods
    // We can define new classes that implement the
    // QuackBehaviour and FlyBehaviour interfaces
    // then use them in whatever future Duck
    // Subclasses we define
    protected FlyBehaviour flyBehaviour;
    protected QuackBehaviour quackBehaviour;

    public void Fly() {
        flyBehaviour.Fly();
    }
    public void Quack() {
       quackBehaviour.Quack();
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour){
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour){
        this.quackBehaviour = quackBehaviour;
    }
}
