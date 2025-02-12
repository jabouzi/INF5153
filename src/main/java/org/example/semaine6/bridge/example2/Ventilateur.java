package org.example.semaine6.bridge.example2;

class Ventilateur implements Appareil {
    @Override
    public void allumer() {
        System.out.println("Ventilateur allumé");
    }

    @Override
    public void eteindre() {
        System.out.println("Ventilateur éteint");
    }
}
