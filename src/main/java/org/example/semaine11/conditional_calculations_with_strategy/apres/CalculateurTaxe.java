package org.example.semaine11.conditional_calculations_with_strategy.apres;

// Contexte (délégation)
public class CalculateurTaxe {
    private StrategieTaxe strategie;

    public CalculateurTaxe(StrategieTaxe strategie) {
        this.strategie = strategie;
    }

    public double calculer(double montant) {
        return strategie.calculer(montant);
    }

    public void setStrategie(StrategieTaxe strategie) {
        this.strategie = strategie;
    }
}
