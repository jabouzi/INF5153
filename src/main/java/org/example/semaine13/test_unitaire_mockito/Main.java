package org.example.semaine13.test_unitaire_mockito;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Dans un environnement réel, vous injecteriez une vraie implémentation
        // de PaymentGateway, par exemple via un framework comme Spring
        PaymentGateway realPaymentGateway = new RealPaymentGateway();
        OrderService orderService = new OrderService(realPaymentGateway);

        // Création d'une commande
        Order order = new Order();
        order.setAmount(199.99);
        order.setCreditCardNumber("4242424242424242");

        // Traitement de la commande
        boolean orderPlaced = orderService.placeOrder(order);

        if (orderPlaced) {
            System.out.println("Commande traitée avec succès!");
            System.out.println("Montant: " + order.getAmount() + " $");
        } else {
            System.out.println("Échec du traitement de la commande");
        }
    }
}
