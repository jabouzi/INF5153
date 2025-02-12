package org.example.semaine6.factory.cart;


import org.example.semaine6.factory.shipping.DomesticShipping;
import org.example.semaine6.factory.shipping.Shipping;

public class DomesticCart extends Cart {
    @Override
    Shipping createShippingMethod() {
        return new DomesticShipping();
    }
}
