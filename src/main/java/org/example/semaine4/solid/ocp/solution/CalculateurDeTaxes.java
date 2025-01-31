package org.example.semaine4.solid.ocp.solution;

import org.example.semaine4.solid.ocp.violation.TypeEmploye;

// Interface pour le calcul des taxes
public interface CalculateurDeTaxes {
    double calculerTaxe(double salaire);

    public static CalculateurDeTaxes obtenirCalculateur(TypeEmploye typeEmploye) {
        switch (typeEmploye) {
            case FREELANCE:
                return new CalculateurDeTaxesFreelance();
            case TEMPS_PLEIN:
                return new CalculateurDeTaxesTempsPlein();
            case TEMPS_PARTIEL:
                return new CalculateurDeTaxesTempsPartiel();
            default:
                throw new IllegalArgumentException("Type d'employé inconnu : " + typeEmploye);
        }
    }
}
