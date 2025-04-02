package org.example.semaine11.extract_adapter.apres;

import org.example.semaine11.extract_adapter.common.Payment;

public class LegacyPaymentAdapter implements PaymentAdapter {
    @Override
    public void process(Payment payment) {
        System.out.println("[LegacyAdapter] Processing: " + payment.getAmount() + " " + payment.getCurrency());
        // Implémentation spécifique à la version 1.0
    }
}
