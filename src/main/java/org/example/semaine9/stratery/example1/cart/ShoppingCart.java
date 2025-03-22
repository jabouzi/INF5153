package org.example.semaine9.stratery.example1.cart;

import org.example.semaine9.stratery.example1.inventory.Product;
import org.example.semaine9.stratery.example1.shipping.ShippingStrategy;
import org.javamoney.moneta.Money;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private static final String DEFAULT_CURRENCY = "USD";

    private final List<Product> items = new ArrayList<>();
    private ShippingStrategy shippingStrategy;

    public void addItem(Product item) {
        items.add(item);
    }

    public void setShippingStrategy(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public Money calculateTotal() {
        Money total = calculateProductsTotal();

        if (shippingStrategy != null) {
            total = shippingStrategy.calculate(total);
        }

        return total;
    }

    private Money calculateProductsTotal() {
        return items.stream()
                .map(Product::getPrice)
                .reduce(Money::add)
                .orElse(Money.of(0, DEFAULT_CURRENCY));
    }
}
