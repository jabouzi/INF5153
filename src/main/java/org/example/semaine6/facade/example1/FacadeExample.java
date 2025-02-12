package org.example.semaine6.facade.example1;

import org.example.semaine6.facade.example1.order.management.OrderFacade;
import org.example.semaine6.facade.example1.order.management.dto.Item;
import org.example.semaine6.facade.example1.order.management.dto.OrderResult;

public class FacadeExample {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();
        OrderResult orderResult = orderFacade.placeOrder(new Item(5), 10);

        System.out.println("Order Processing Result = " + orderResult);
    }
}

/*
Checking availability for item = Item[id=5], and quantity = 10
Processing payment for item = Item[id=5], and quantity = 10
Shipping item = Item[id=5], with quantity = 10
Notification: order placed for item = Item[id=5] with quantity = 10
Order Processing Result = SUCCESS
 */
