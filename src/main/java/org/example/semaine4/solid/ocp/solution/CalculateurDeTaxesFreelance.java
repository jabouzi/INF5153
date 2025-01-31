package org.example.semaine4.solid.ocp.solution;

// Implémentation pour les employés freelances
public class CalculateurDeTaxesFreelance implements CalculateurDeTaxes {
    @Override
    public double calculerTaxe(double salaire) {
        return salaire * 0.1; // 10%
    }
}
