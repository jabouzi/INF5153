package org.example.semaine5.uml.aggregation;

import java.util.ArrayList;
import java.util.List;

// Classe Departement
class Departement {
    private String nom;
    private List<Professeur> professeurs;

    public Departement(String nom) {
        this.nom = nom;
        this.professeurs = new ArrayList<>();
    }

    public void ajouterProfesseur(Professeur professeur) {
        professeurs.add(professeur);
    }

    public void afficherProfesseurs() {
        System.out.println("Departement " + nom + " emploie :");
        for (Professeur professeur : professeurs) {
            System.out.println("- " + professeur.getNom());
        }
    }
}
