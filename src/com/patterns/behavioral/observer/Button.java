package com.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Button implements Subject {

    List<Observer> observers = new ArrayList<>();

    public void clicked() {
        change();
    }

    @Override
    public void attachObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void detachObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void change() {
        observers.forEach(Observer::update);
    }
}
