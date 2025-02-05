package org.example.semaine5.patrons.fabrique.sans;

// Sans Patron de Conception (Fabrique Simple)
// Problème :
// Vous avez besoin de créer des objets Camion et Bateau pour une application de logistique.
// Sans la fabrique, le code est directement couplé aux classes concrètes.
public class SansFabriqueExample {
    public static void main(String[] args) {
        // Création directe des objets
        Camion camion = new Camion();
        Bateau bateau = new Bateau();

        // Utilisation des objets
        camion.livrer();
        bateau.livrer();
    }
}
