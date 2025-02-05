package org.example.semaine5.patrons.monteur;

// Classe principale pour tester le patron Builder
public class BuilderExample {
    public static void main(String[] args) {
        // Création du constructeur
        Builder constructeur = new ConstructeurMaison();

        // Création du directeur
        Directeur directeur = new Directeur(constructeur);

        // Construction d'une maison basique
        directeur.construireMaisonBasique();
        Maison maisonBasique = constructeur.getResultat();
        System.out.println("Maison Basique : " + maisonBasique);

        // Construction d'une maison de luxe
        directeur.construireMaisonDeLuxe();
        Maison maisonDeLuxe = constructeur.getResultat();
        System.out.println("Maison de Luxe : " + maisonDeLuxe);
    }
}
