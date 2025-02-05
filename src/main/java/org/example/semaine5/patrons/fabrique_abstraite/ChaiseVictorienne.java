package org.example.semaine5.patrons.fabrique_abstraite;

// Produits Victorien
class ChaiseVictorienne implements Chaise {
    @Override
    public void sasseoir() {
        System.out.println("S'asseoir sur une chaise victorienne.");
    }
}
