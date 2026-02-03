package org.example.stock;

import org.example.common.Observer;
import org.example.common.Subject;

import java.util.ArrayList;
import java.util.List;

public class Stock implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private double price;

    public void setSprice(double price){
        this.price = price;
        notifyObserver();
    }
    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer o : observers){
            o.update("Gia co phieu moi: " + price);
        }
    }
}
