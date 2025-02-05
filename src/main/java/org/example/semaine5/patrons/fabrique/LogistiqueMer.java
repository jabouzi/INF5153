package org.example.semaine5.patrons.fabrique;

// Sous-classe LogistiqueMer
class LogistiqueMer extends Logistique {
    @Override
    public Transport creerTransport() {
        return new Bateau(); // Retourne un Bateau
    }
}
