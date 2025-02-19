package org.example.semaine7.mediator.example2;

class Avion {
    private String nom;
    private TourDeControle tourDeControle;

    public Avion(String nom, TourDeControle tourDeControle) {
        this.nom = nom;
        this.tourDeControle = tourDeControle;
    }

    public String getNom() {
        return nom;
    }

    public void envoyerMessage(String message) {
        tourDeControle.transmettreMessage(message, this);
    }
}

