package org.example.semaine9.stratery.example1.inventory;

import org.javamoney.moneta.Money;

public class Product {
    private final Money price;

    public Product(Money price) {
        this.price = price;
    }

    public Money getPrice() {
        return price;
    }
}
