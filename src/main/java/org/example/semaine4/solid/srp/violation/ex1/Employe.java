package org.example.semaine4.solid.srp.violation.ex1;

public class Employe {
    private String id;

    public Employe(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public double calculerSalaireMensuel() {
        // Logic to calculate salary
        return 3000.0; // Exemple fictif
    }

    public String genererRapportHeuresMensuelles() {
        // Logic to generate hours report
        return "Heures mensuelles : 160";
    }

    public void sauvegarderModifications() {
        // Logic to save changes
        System.out.println("Modifications sauvegardées pour l'employé " + id);
    }
}
