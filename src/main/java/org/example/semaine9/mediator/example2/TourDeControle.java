package org.example.semaine9.mediator.example2;

class TourDeControle {
    public void transmettreMessage(String message, Avion avion) {
        System.out.println(avion.getNom() + " a reçu : " + message);
    }
}
