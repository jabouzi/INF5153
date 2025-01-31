package org.example.semaine4.solid.ocp.solution;

// Fabrique pour obtenir le calculateur approprié
public class FabriqueDeCalculateurDeTaxes {
    public CalculateurDeTaxes obtenirCalculateur(String typeEmploye) {
        switch (typeEmploye) {
            case "freelance":
                return new CalculateurDeTaxesFreelance();
            case "temps_plein":
                return new CalculateurDeTaxesTempsPlein();
            case "temps_partiel":
                return new CalculateurDeTaxesTempsPartiel();
            default:
                throw new IllegalArgumentException("Type d'employé inconnu : " + typeEmploye);
        }
    }
}
