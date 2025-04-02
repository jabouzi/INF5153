package org.example.semaine11.extract_adapter.apres;

import org.example.semaine11.extract_adapter.common.Payment;

public class ModernPaymentAdapter implements PaymentAdapter {
    @Override
    public void process(Payment payment) {
        System.out.println("[ModernAdapter] Submitting: " + payment.getAmount() + " " + payment.getCurrency());
        // Implémentation spécifique à la version 2.0
    }
}
