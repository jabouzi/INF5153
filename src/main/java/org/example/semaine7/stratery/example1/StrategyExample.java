package org.example.semaine7.stratery.example1;


import org.example.semaine7.stratery.example1.cart.ShoppingCart;
import org.example.semaine7.stratery.example1.inventory.Product;
import org.example.semaine7.stratery.example1.shipping.DomesticShippingStrategy;
import org.example.semaine7.stratery.example1.shipping.InternationalShippingStrategy;
import org.javamoney.moneta.Money;

class StrategyExample {

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addItem(new Product(Money.of(100, "USD")));
        shoppingCart.addItem(new Product(Money.of(200, "USD")));
        shoppingCart.addItem(new Product(Money.of(300, "USD")));

        shoppingCart.setShippingStrategy(new DomesticShippingStrategy());
        System.out.println("Total including domestic shipping is: " + shoppingCart.calculateTotal());

        shoppingCart.setShippingStrategy(new InternationalShippingStrategy());
        System.out.println("Total including international shipping is: " + shoppingCart.calculateTotal());
    }
}
