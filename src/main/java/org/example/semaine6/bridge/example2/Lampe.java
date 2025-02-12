package org.example.semaine6.bridge.example2;

// Implémentations concrètes (lampe, ventilateur)
class Lampe implements Appareil {
    @Override
    public void allumer() {
        System.out.println("Lampe allumée");
    }

    @Override
    public void eteindre() {
        System.out.println("Lampe éteinte");
    }
}

