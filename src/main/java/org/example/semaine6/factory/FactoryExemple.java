package org.example.semaine6.factory;

import org.example.semaine6.factory.cart.Cart;
import org.example.semaine6.factory.cart.DomesticCart;
import org.example.semaine6.factory.cart.InternationalCart;
import org.example.semaine6.factory.product.Product;
import org.javamoney.moneta.Money;

public class FactoryExemple {
    public static void main(String[] args) {
        Product product1 = new Product("Bicycle", Money.of(475, "USD"));
        Product product2 = new Product("Laptop", Money.of(800, "USD"));

        Cart cart = new DomesticCart();
        cart.addProduct(product1);
        cart.addProduct(product2);

        System.out.println("Domestic Cart Total = " + cart.calculateTotalCost());

        cart = new InternationalCart();
        cart.addProduct(product1);
        cart.addProduct(product2);

        System.out.println("International Cart Cart Total = " + cart.calculateTotalCost());
    }
}


/*
Domestic Cart Total = USD 1530.00
International Cart Cart Total = USD 1785.00
 */