package org.example.semaine4.grasp.expert;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
    private final List<Livre> livres;

    public Bibliotheque() {
        this.livres = new ArrayList<>();
    }

    public void ajouterLivre(Livre livre) {
        livres.add(livre);
    }

    public boolean emprunterLivre(String titre) {
        for (Livre livre : livres) {
            if (livre.getTitre().equals(titre)) {
                return livre.emprunter(); // La logique d'emprunt est transférée à la classe Livre
            }
        }
        System.out.println("Le livre \"" + titre + "\" est introuvable dans la bibliothèque.");
        return false;
    }

    public boolean retournerLivre(String titre) {
        for (Livre livre : livres) {
            if (livre.getTitre().equals(titre)) {
                return livre.retourner(); // La logique de retour est transférée à la classe Livre
            }
        }
        System.out.println("Le livre \"" + titre + "\" est introuvable dans la bibliothèque.");
        return false;
    }
}