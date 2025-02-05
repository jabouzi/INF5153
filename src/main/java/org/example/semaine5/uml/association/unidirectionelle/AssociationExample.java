package org.example.semaine5.uml.association.unidirectionelle;

// Main
public class AssociationExample {
    public static void main(String[] args) {
        Professeur professeur = new Professeur("M. Dupont");
        Etudiant etudiant1 = new Etudiant("Alice");
        Etudiant etudiant2 = new Etudiant("Bob");

        professeur.ajouterEtudiant(etudiant1);
        professeur.ajouterEtudiant(etudiant2);

        professeur.afficherEtudiants();
    }
}
