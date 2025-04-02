package org.example.semaine11.extract_adapter.common;

import org.example.semaine11.extract_adapter.apres.LegacyPaymentAdapter;
import org.example.semaine11.extract_adapter.apres.ModernPaymentAdapter;
import org.example.semaine11.extract_adapter.apres.PaymentAdapter;
import org.example.semaine11.extract_adapter.apres.PaymentProcessorRefactored;
import org.example.semaine11.extract_adapter.avant.PaymentProcessor;

public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment(100.0, "USD");

        ///////////////////////////////////
        // APPROCHE AVANT (Problématique) //
        ///////////////////////////////////
        System.out.println("=== AVANT (Classe monolythique) ===");
        PaymentProcessor processorV1 = new PaymentProcessor("1.0");
        processorV1.process(payment); // Utilise Legacy API

        PaymentProcessor processorV2 = new PaymentProcessor("2.0");
        processorV2.process(payment); // Utilise Modern API

        ///////////////////////////////////
        // APPROCHE APRÈS (Avec Adapters) //
        ///////////////////////////////////
        System.out.println("\n=== APRÈS (Avec Adaptateurs) ===");
        PaymentAdapter legacyAdapter = new LegacyPaymentAdapter();
        legacyAdapter.process(payment); // Version 1.0

        PaymentAdapter modernAdapter = new ModernPaymentAdapter();
        modernAdapter.process(payment); // Version 2.0

        // Client utilisant le PaymentProcessor refactoré
        PaymentProcessorRefactored processor = new PaymentProcessorRefactored("1.0");
        processor.process(payment);
    }
}
