package org.example.semaine7.iterator.example1;

import org.example.semaine7.iterator.example1.product.inventory.Iterator;
import org.example.semaine7.iterator.example1.product.inventory.Product;
import org.example.semaine7.iterator.example1.product.inventory.ProductInventory;
import org.javamoney.moneta.Money;

public class IteratorExample {
    public static void main(String[] args) {
        ProductInventory inventory = new ProductInventory();
        inventory.addProduct(new Product("Car", Money.of(30000, "USD")));
        inventory.addProduct(new Product("Bicycle", Money.of(475, "USD")));
        inventory.addProduct(new Product("Laptop", Money.of(800, "USD")));

        Iterator<Product> iterator = inventory.createIterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();

            System.out.println(product);
        }
    }
}
