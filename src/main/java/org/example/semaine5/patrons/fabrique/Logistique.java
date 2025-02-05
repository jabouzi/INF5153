package org.example.semaine5.patrons.fabrique;

// Classe abstraite Logistique
abstract class Logistique {
    // Méthode pour planifier une livraison
    public void planifierLivraison() {
        Transport transport = creerTransport();
        System.out.println("Planification de la livraison...");
        transport.livrer();
    }

    // Méthode fabrique abstraite
    public abstract Transport creerTransport();
}
