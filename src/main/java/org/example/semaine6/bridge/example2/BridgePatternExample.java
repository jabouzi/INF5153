package org.example.semaine6.bridge.example2;

// Exemple d'utilisation
public class BridgePatternExample {
    public static void main(String[] args) {
        // Création des appareils
        Appareil lampe = new Lampe();
        Appareil ventilateur = new Ventilateur();

        // Création des interrupteurs
        Interrupteur interrupteurLampe = new InterrupteurSimple(lampe);
        Interrupteur interrupteurVentilateur = new InterrupteurSimple(ventilateur);

        // Utilisation des interrupteurs
        interrupteurLampe.activer();
        interrupteurVentilateur.activer();
    }
}
