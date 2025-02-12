package org.example.semaine6.bridge.example2;

// Abstraction (interrupteur)
abstract class Interrupteur {
    protected Appareil appareil;

    public Interrupteur(Appareil appareil) {
        this.appareil = appareil;
    }

    public abstract void activer();
}
