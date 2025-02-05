package org.example.semaine5.patrons.fabrique;

// Classe Camion
class Camion implements Transport {
    @Override
    public void livrer() {
        System.out.println("Livraison par camion sur la route.");
    }
}
