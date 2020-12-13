package com.menwhorust.behavioral.observer.eventing;

public interface EventListener<TValue> {
    void ActionPerform(TValue value);
}
