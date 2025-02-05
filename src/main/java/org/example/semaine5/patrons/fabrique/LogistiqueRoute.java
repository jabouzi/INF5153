package org.example.semaine5.patrons.fabrique;

// Sous-classe LogistiqueRoute
class LogistiqueRoute extends Logistique {
    @Override
    public Transport creerTransport() {
        return new Camion(); // Retourne un Camion
    }
}
