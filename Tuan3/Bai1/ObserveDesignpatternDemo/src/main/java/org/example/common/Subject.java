package org.example.common;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObserver();
}
