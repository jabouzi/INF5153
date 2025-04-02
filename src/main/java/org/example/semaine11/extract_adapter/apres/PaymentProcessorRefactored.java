package org.example.semaine11.extract_adapter.apres;

import org.example.semaine11.extract_adapter.common.Payment;

public class PaymentProcessorRefactored {
    private PaymentAdapter adapter;

    public PaymentProcessorRefactored(String apiVersion) {
        this.adapter = ("1.0".equals(apiVersion))
                ? new LegacyPaymentAdapter()
                : new ModernPaymentAdapter();
    }

    public void process(Payment payment) {
        adapter.process(payment);
    }
}
