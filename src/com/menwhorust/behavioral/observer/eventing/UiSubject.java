package com.menwhorust.behavioral.observer.eventing;

public interface UiSubject<TValue> {
    void addEventListener(EventListener<TValue> listener);
    void removeEventListener(EventListener<TValue> listener);

}
