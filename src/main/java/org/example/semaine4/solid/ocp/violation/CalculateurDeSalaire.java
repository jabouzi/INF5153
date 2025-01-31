package org.example.semaine4.solid.ocp.violation;

public class CalculateurDeSalaire {
    public double calculerSalaire(TypeEmploye typeEmploye, double salaire) {
        double taxe;

        // Bloc conditionnel pour les différents types d'employés
        if (typeEmploye.equals(TypeEmploye.FREELANCE)) {
            taxe = salaire * 0.1; // 10% pour les freelances
        } else if (typeEmploye.equals(TypeEmploye.TEMPS_PLEIN)) {
            taxe = salaire * 0.2; // 20% pour les employés à temps plein
        } else if (typeEmploye.equals(TypeEmploye.TEMPS_PARTIEL)) {
            taxe = salaire * 0.15; // 15% pour les employés à temps partiel
        } else {
            throw new IllegalArgumentException("Type d'employé inconnu : " + typeEmploye);
        }

        return salaire - taxe;
    }
}
