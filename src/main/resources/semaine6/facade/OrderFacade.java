package org.example.semaine6.facade.example1.management;


import org.example.semaine6.facade.example1.order.management.dto.Item;
import org.example.semaine6.facade.example1.order.management.dto.OrderResult;
import org.example.semaine6.facade.example1.order.management.subsystem.InventoryManager;
import org.example.semaine6.facade.example1.order.management.subsystem.NotificationService;
import org.example.semaine6.facade.example1.order.management.subsystem.PaymentProcessor;
import org.example.semaine6.facade.example1.order.management.subsystem.ShippingManager;

public class OrderFacade {
    private final InventoryManager inventoryManager = new InventoryManager();
    private final PaymentProcessor paymentProcessor = new PaymentProcessor();
    private final ShippingManager shippingManager = new ShippingManager();
    private final NotificationService notificationService = new NotificationService();

    public OrderResult placeOrder(Item item, int quantity) {
        boolean available = inventoryManager.checkAvailability(item, quantity);
        if (!available) {
            notificationService.onItemNotAvailable(item, quantity);
            return INVENTORY_NOT_AVAILABLE;
        }

        boolean paymentSuccessful = paymentProcessor.makePayment(item, quantity);
        if (paymentSuccessful) {
            shippingManager.shipOrder(item, quantity);
            notificationService.onOrderPlaced(item, quantity);
            return SUCCESS;
        } else {
            notificationService.onPaymentFailed(item, quantity);
            return PAYMENT_FAILED;
        }
    }
}
