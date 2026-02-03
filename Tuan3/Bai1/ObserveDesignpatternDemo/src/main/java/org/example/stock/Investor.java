package org.example.stock;

import org.example.common.Observer;
import org.example.common.Subject;

public class Investor implements Observer {
    private String name;

    public Investor(String name){
        this.name=name;
    }

    @Override
    public void update(String message) {
        System.out.println("Nha dau tu "+ name + " nhan thong bao: "+ message);
    }
}
