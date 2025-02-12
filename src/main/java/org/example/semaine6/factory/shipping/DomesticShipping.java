package org.example.semaine6.factory.shipping;

import org.javamoney.moneta.Money;

public class DomesticShipping implements Shipping {
    @Override
    public Money calculateShippingCost(Money totalProductsCost) {
        return totalProductsCost.multiply(0.2);
    }
}
