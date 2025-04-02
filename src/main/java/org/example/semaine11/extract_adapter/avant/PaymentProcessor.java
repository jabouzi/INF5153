package org.example.semaine11.extract_adapter.avant;


import org.example.semaine11.extract_adapter.common.Payment;

public class PaymentProcessor {
    private boolean useLegacyAPI;

    public PaymentProcessor(String apiVersion) {
        this.useLegacyAPI = "1.0".equals(apiVersion);
    }

    public void process(Payment payment) {
        if (useLegacyAPI) {
            System.out.println("[Legacy] Processing payment: " + payment.getAmount() + " " + payment.getCurrency());
            // Appel à l'ancienne API...
        } else {
            System.out.println("[Modern] Submitting payment: " + payment.getAmount() + " " + payment.getCurrency());
            // Appel à la nouvelle API...
        }
    }
}
