package org.example.semaine5.uml.association.bidirectionelle;

import java.util.ArrayList;
import java.util.List;

// Classe Personne
class Personne {
    private String nom;
    private List<Voiture> voitures;

    public Personne(String nom) {
        this.nom = nom;
        this.voitures = new ArrayList<>();
    }

    public void ajouterVoiture(Voiture voiture) {
        voitures.add(voiture);
        voiture.setProprietaire(this); // Lien bidirectionnel
    }

    public List<Voiture> getVoitures() {
        return voitures;
    }

    public String getNom() {
        return nom;
    }
}

