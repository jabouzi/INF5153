package org.example.semaine6.factory.cart;

import org.example.semaine6.factory.product.Product;
import org.example.semaine6.factory.shipping.Shipping;
import org.javamoney.moneta.Money;

import java.util.LinkedList;
import java.util.List;

public abstract class Cart {
    private final List<Product> products = new LinkedList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public Money calculateTotalCost() {
        Money totalProductsCost = calculateTotalProductsCost();
        Money shippingCosts = calculateShippingCost(totalProductsCost);
        Money totalCost = totalProductsCost.add(shippingCosts);

        return totalCost;
    }

    private Money calculateTotalProductsCost() {
        return products.stream()
                .map(Product::price)
                .reduce(Money::add)
                .orElse(Money.of(0, "USD"));
    }

    Money calculateShippingCost(Money totalProductsCost) {
        Shipping shippingMethod = createShippingMethod();
        return shippingMethod.calculateShippingCost(totalProductsCost);
    }

    abstract Shipping createShippingMethod();
}
