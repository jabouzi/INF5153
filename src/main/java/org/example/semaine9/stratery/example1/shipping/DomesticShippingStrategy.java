package org.example.semaine9.stratery.example1.shipping;

import org.javamoney.moneta.Money;

public class DomesticShippingStrategy implements ShippingStrategy {
    private static final double RATE = 0.05;

    @Override
    public Money calculate(Money total) {
        return total.add(total.multiply(RATE));
    }
}
