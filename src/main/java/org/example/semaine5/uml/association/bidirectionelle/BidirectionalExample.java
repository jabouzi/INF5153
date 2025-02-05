package org.example.semaine5.uml.association.bidirectionelle;

// Main
public class BidirectionalExample {
    public static void main(String[] args) {
        Personne personne = new Personne("Jean");
        Voiture voiture1 = new Voiture("Toyota");
        Voiture voiture2 = new Voiture("Honda");

        personne.ajouterVoiture(voiture1);
        personne.ajouterVoiture(voiture2);

        System.out.println(personne.getNom() + " possede :");
        for (Voiture voiture : personne.getVoitures()) {
            System.out.println("- " + voiture.getModele());
        }

        System.out.println(voiture1.getModele() + " appartient a " + voiture1.getProprietaire().getNom());
        System.out.println(voiture2.getModele() + " appartient a " + voiture2.getProprietaire().getNom());
    }
}
