package org.example.semaine5.uml.aggregation;

// Main
public class AggregationExample {
    public static void main(String[] args) {
        Departement departement = new Departement("Informatique");
        Professeur professeur1 = new Professeur("M. Smith");
        Professeur professeur2 = new Professeur("Mme. Johnson");

        departement.ajouterProfesseur(professeur1);
        departement.ajouterProfesseur(professeur2);

        departement.afficherProfesseurs();
    }
}
