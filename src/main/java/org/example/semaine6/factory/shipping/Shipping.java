package org.example.semaine6.factory.shipping;

import org.javamoney.moneta.Money;

public interface Shipping {
    Money calculateShippingCost(Money totalProductsCost);
}
