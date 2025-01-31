package org.example.semaine4.solid.ocp.solution;

// Implémentation pour les employés à temps plein
public class CalculateurDeTaxesTempsPlein implements CalculateurDeTaxes {
    @Override
    public double calculerTaxe(double salaire) {
        return salaire * 0.2; // 20%
    }
}
