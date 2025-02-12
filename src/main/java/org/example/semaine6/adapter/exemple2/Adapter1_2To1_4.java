package org.example.semaine6.adapter.exemple2;

// Adaptateur permettant de connecter un cliquet de 1/2” à une douille de 1/4”
class Adapter1_2To1_4 implements Socket {
    private Ratchet ratchet;

    public Adapter1_2To1_4(Ratchet ratchet) {
        this.ratchet = ratchet;
    }

    @Override
    public void useSocket() {
        System.out.println("Adaptateur connecté : conversion du cliquet 1/2\" vers la douille 1/4\".");
        ratchet.useRatchet(); // Utilisation du cliquet via l'adaptateur
        System.out.println("La douille de 1/4\" est maintenant utilisable.");
    }
}
