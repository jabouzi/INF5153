package org.example.semaine6.facade.example1.order.management.subsystem;

import org.example.semaine6.facade.example1.order.management.dto.Item;

public class InventoryManager {
    public boolean checkAvailability(Item item, int quantity) {
        // Check if item is available
        System.out.println("Checking availability for item = " + item + ", and quantity = " + quantity);
        return true;
    }
}
