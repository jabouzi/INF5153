package org.example.semaine5.uml.association.unidirectionelle;

import java.util.ArrayList;
import java.util.List;

// Classe Professeur
class Professeur {
    private String nom;
    private List<Etudiant> etudiants;

    public Professeur(String nom) {
        this.nom = nom;
        this.etudiants = new ArrayList<>();
    }

    public void ajouterEtudiant(Etudiant etudiant) {
        etudiants.add(etudiant);
    }

    public void afficherEtudiants() {
        System.out.println(nom + " enseigne à :");
        for (Etudiant etudiant : etudiants) {
            System.out.println("- " + etudiant.getNom());
        }
    }
}

