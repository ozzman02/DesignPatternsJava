package com.patterns.behavioral.observer;

public interface Subject {

    void attachObserver(Observer observer);

    void detachObserver(Observer observer);

    void change();

}
