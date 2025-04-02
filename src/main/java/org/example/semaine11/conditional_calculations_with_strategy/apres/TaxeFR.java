package org.example.semaine11.conditional_calculations_with_strategy.apres;

// Implémentations
public class TaxeFR implements StrategieTaxe {
    @Override
    public double calculer(double montant) {
        return montant * 0.20;
    }
}
