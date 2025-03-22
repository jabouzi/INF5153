package org.example.semaine9.mediator.example2;

// Utilisation
public class MediatorExample {
    public static void main(String[] args) {
        TourDeControle tourDeControle = new TourDeControle();
        Avion avion1 = new Avion("Vol 123", tourDeControle);
        Avion avion2 = new Avion("Vol 456", tourDeControle);

        avion1.envoyerMessage("Demande d'atterrissage"); // Vol 123 a reçu : Demande d'atterrissage
        avion2.envoyerMessage("Demande de décollage"); // Vol 456 a reçu : Demande de décollage
    }
}
