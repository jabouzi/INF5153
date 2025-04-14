package org.example.semaine13.test_unitaire_mockito;

public class OrderService {
    private PaymentGateway paymentGateway;

    public OrderService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public boolean placeOrder(Order order) throws InterruptedException {
        // Logique de validation de la commande
        if (order.getAmount() <= 0) {
            return false;
        }

        // Traitement du paiement
        boolean paymentSuccess = paymentGateway.processPayment(
                order.getAmount(),
                order.getCreditCardNumber()
        );

        if (paymentSuccess) {
            // Logique supplémentaire: enregistrement de la commande, envoi d'email, etc.
            return true;
        }
        return false;
    }
}
