package org.example.semaine5.uml.realisation;

// Classe Voiture
class Voiture implements Vehicule {
    @Override
    public void demarrer() {
        System.out.println("La voiture demarre.");
    }

    @Override
    public void arreter() {
        System.out.println("La voiture s'arrete.");
    }
}
