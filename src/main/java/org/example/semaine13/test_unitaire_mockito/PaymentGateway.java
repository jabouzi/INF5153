package org.example.semaine13.test_unitaire_mockito;

public interface PaymentGateway {
    boolean processPayment(double amount, String cardNumber) throws InterruptedException;
}
