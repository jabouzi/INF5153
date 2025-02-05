package org.example.semaine5.patrons.fabrique;

// Classe principale pour tester le patron Fabrique
public class FabriqueExample {
    public static void main(String[] args) {
        // Utilisation de LogistiqueRoute
        Logistique logistiqueRoute = new LogistiqueRoute();
        logistiqueRoute.planifierLivraison(); // Planifie une livraison par camion

        // Utilisation de LogistiqueMer
        Logistique logistiqueMer = new LogistiqueMer();
        logistiqueMer.planifierLivraison(); // Planifie une livraison par bateau
    }
}
