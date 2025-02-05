package org.example.semaine5.uml.association.bidirectionelle;

// Classe Voiture
class Voiture {
    private String modele;
    private Personne proprietaire;

    public Voiture(String modele) {
        this.modele = modele;
    }

    public void setProprietaire(Personne proprietaire) {
        this.proprietaire = proprietaire;
    }

    public Personne getProprietaire() {
        return proprietaire;
    }

    public String getModele() {
        return modele;
    }
}
