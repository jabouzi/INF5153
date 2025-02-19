package org.example.semaine7.observer.example2;

// Utilisation
public class ObserverExample {
    public static void main(String[] args) {
        Enchere enchere = new Enchere();
        Observateur enchirisseur1 = new Enchirisseur("Alice");
        Observateur enchirisseur2 = new Enchirisseur("Bob");

        enchere.ajouterObservateur(enchirisseur1);
        enchere.ajouterObservateur(enchirisseur2);

        enchere.setPrixActuel(100); // Alice et Bob recoivent la notification
    }
}
