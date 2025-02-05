package org.example.semaine5.patrons.fabrique;

// Classe Bateau
class Bateau implements Transport {
    @Override
    public void livrer() {
        System.out.println("Livraison par bateau sur la mer.");
    }
}
