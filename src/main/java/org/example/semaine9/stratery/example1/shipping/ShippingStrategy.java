package org.example.semaine9.stratery.example1.shipping;

import org.javamoney.moneta.Money;

public interface ShippingStrategy {
    Money calculate(Money total);
}
