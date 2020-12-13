package com.menwhorust.behavioral.observer.eventing;

import java.util.ArrayList;

public class ConcreteUiSubject<TValue> implements UiSubject<TValue>{
    private TValue someValue;
    private final ArrayList<EventListener<TValue>> eventListeners = new ArrayList<>();

    ConcreteUiSubject(TValue subjectValue) {
        someValue = subjectValue;
    }

    @Override
    public void addEventListener(EventListener<TValue> listener) {
        eventListeners.add(listener);
    }

    @Override
    public void removeEventListener(EventListener<TValue> listener) {
        eventListeners.remove(listener);
    }
    
    private void changed(){
        for (EventListener<TValue> listener :
                eventListeners) {
            listener.ActionPerform(someValue);
        }
    }

    public TValue getValue(){
        return someValue;
    }

    public void setValue(TValue value){
        if(someValue == value)
            return;

        someValue = value;
        changed();
    }
}
