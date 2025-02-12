package org.example.semaine6.facade.example1.order.management.subsystem;

import org.example.semaine6.facade.example1.order.management.dto.Item;

public class NotificationService {
    public void onItemNotAvailable(Item item, int quantity) {
        System.out.println("Notification: item = " + item + " with quantity = " + quantity + " not available");
    }

    public void onOrderPlaced(Item item, int quantity) {
        System.out.println("Notification: order placed for item = " + item + " with quantity = " + quantity);
    }

    public void onPaymentFailed(Item item, int quantity) {
        System.out.println("Notification: payment failed for item = " + item + " with quantity = " + quantity);
    }
}
