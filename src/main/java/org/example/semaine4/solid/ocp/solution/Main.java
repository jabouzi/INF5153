package org.example.semaine4.solid.ocp.solution;

import org.example.semaine4.solid.ocp.violation.TypeEmploye;

public class Main {
    public static void main(String[] args) {
        CalculateurDeSalaire calculateur = new CalculateurDeSalaire();

        double salaireFreelance = calculateur.calculerSalaire(TypeEmploye.FREELANCE, 5000);
        double salaireTempsPlein = calculateur.calculerSalaire(TypeEmploye.TEMPS_PLEIN, 5000);
        double salaireTempsPartiel = calculateur.calculerSalaire(TypeEmploye.TEMPS_PARTIEL, 5000);

        System.out.println("Salaire Freelance : " + salaireFreelance);
        System.out.println("Salaire Temps Plein : " + salaireTempsPlein);
        System.out.println("Salaire Temps Partiel : " + salaireTempsPartiel);
    }
}
