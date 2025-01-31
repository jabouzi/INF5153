package org.example.semaine4.solid.ocp.solution;

// Implémentation pour les employés à temps partiel
public class CalculateurDeTaxesTempsPartiel implements CalculateurDeTaxes {
    @Override
    public double calculerTaxe(double salaire) {
        return salaire * 0.15; // 15%
    }
}
