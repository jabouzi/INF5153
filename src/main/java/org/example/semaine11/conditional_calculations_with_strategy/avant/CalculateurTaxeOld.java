package org.example.semaine11.conditional_calculations_with_strategy.avant;

public class CalculateurTaxeOld {
    public double calculer(String pays, double montant) {
        switch (pays) {
            case "FR":
                return montant * 0.20; // TVA française
            case "US":
                return montant * 0.08; // Taxe US
            case "CA":
                return montant * 0.15; // Taxe canadienne
            default:
                throw new IllegalArgumentException("Pays non supporté");
        }
    }
}
