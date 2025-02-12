package org.example.semaine6.factory.shipping;

import org.javamoney.moneta.Money;

public class InternationalShipping implements Shipping {
    @Override
    public Money calculateShippingCost(Money totalProductsCost) {
        return totalProductsCost.multiply(0.4);
    }
}
