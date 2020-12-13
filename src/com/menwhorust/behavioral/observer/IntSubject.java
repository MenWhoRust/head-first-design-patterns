package com.menwhorust.behavioral.observer;

import java.util.ArrayList;

public class IntSubject implements Subject {
    // With the observer pattern we keep a list of observers
    // on a subject class so the observers will know of any
    // changes.
    private int value = 0;
    private final ArrayList<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);

    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public int getState(){
        return value;
    }

    public void setState(int value) {
        this.value = value;
        notifyObservers();
    }
}
