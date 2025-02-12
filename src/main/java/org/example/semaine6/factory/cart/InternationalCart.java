package org.example.semaine6.factory.cart;


import org.example.semaine6.factory.shipping.InternationalShipping;
import org.example.semaine6.factory.shipping.Shipping;

public class InternationalCart extends Cart {
    @Override
    Shipping createShippingMethod() {
        return new InternationalShipping();
    }
}
