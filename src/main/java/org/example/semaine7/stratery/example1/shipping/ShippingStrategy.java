package org.example.semaine7.stratery.example1.shipping;

import org.javamoney.moneta.Money;

public interface ShippingStrategy {
    Money calculate(Money total);
}
