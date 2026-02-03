package org.example;

import org.example.stock.Investor;
import org.example.stock.Stock;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock();
        Investor a = new Investor("Hoan");
        Investor b = new Investor("Tuan");
        Investor c = new Investor("Khanh");

        stock.attach(a);
        stock.attach(b);

        stock.setSprice(20000);

    }
}