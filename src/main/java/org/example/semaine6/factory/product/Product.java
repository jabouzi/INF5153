package org.example.semaine6.factory.product;

import org.javamoney.moneta.Money;

public record Product(String name, Money price) {
}
