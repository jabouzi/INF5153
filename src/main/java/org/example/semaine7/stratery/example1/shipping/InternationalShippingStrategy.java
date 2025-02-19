package org.example.semaine7.stratery.example1.shipping;

import org.javamoney.moneta.Money;

public class InternationalShippingStrategy implements ShippingStrategy {
    private static final double RATE = 0.1;

    @Override
    public Money calculate(Money total) {
        return total.add(total.multiply(RATE));
    }
}
