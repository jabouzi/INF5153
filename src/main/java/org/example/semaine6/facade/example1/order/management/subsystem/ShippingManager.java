package org.example.semaine6.facade.example1.order.management.subsystem;

import org.example.semaine6.facade.example1.order.management.dto.Item;

public class ShippingManager {
    public void shipOrder(Item item, int quantity) {
        // Ship the item
        System.out.println("Shipping item = " + item + ", with quantity = " + quantity);
    }
}

