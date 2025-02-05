package org.example.semaine5.uml.old.realization;

// Définition : Une classe implémente une interface.
public class Main {
    public static void main(String[] args) {
        Payment payment = new CreditCardPayment();
        payment.pay(100.0);
    }
}
