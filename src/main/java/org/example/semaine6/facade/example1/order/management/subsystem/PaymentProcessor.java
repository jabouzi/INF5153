package org.example.semaine6.facade.example1.order.management.subsystem;

import org.example.semaine6.facade.example1.order.management.dto.Item;

public class PaymentProcessor {
    public boolean makePayment(Item item, int quantity) {
        // Process payment for the item
        System.out.println("Processing payment for item = " + item + ", and quantity = " + quantity);
        return true;
    }
}
