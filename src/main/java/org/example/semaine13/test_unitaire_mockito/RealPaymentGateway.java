package org.example.semaine13.test_unitaire_mockito;

// Implémentation réelle de PaymentGateway qui serait utilisée en production
class RealPaymentGateway implements PaymentGateway {
    @Override
    public boolean processPayment(double amount, String cardNumber) throws InterruptedException {
        // Logique réelle de traitement du paiement
        // Par exemple, appel à un service de paiement externe comme Stripe ou PayPal
        System.out.println("Traitement du paiement de " + amount + " $ avec la carte " + cardNumber);
        System.out.print("Connexion au service de paiement");

        // Simulation d'un appel distant avec une barre de progression
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(500); // 500ms × 10 = 5 secondes au total
                System.out.print(".");
                System.out.flush(); // Pour s'assurer que le point s'affiche immédiatement
            }
            System.out.println("\nPaiement traité!");
        } catch (InterruptedException e) {
            System.out.println("\nLe traitement du paiement a été interrompu");
            return false;
        }
        // Logique simplifiée pour simulation
        return cardNumber.startsWith("4") && amount > 0;  // Accepte seulement les cartes Visa (commençant par 4)
    }
}
