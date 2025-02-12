package org.example.semaine6.bridge.example2;

// Implémentation concrète de l'interrupteur
class InterrupteurSimple extends Interrupteur {
    public InterrupteurSimple(Appareil appareil) {
        super(appareil);
    }

    @Override
    public void activer() {
        System.out.println("Interrupteur activé");
        appareil.allumer();
    }
}
