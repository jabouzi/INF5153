package org.example.semaine5.uml.composition;

import java.util.ArrayList;
import java.util.List;

// Classe Maison
class Maison {
    private String adresse;
    private List<Chambre> chambres;

    public Maison(String adresse) {
        this.adresse = adresse;
        this.chambres = new ArrayList<>();
    }

    public void ajouterPiece(Chambre piece) {
        chambres.add(piece);
    }

    public void afficherPieces() {
        System.out.println("Maison a l'adresse " + adresse + " contient :");
        for (Chambre piece : chambres) {
            System.out.println("- Piece numero " + piece.getNumero());
        }
    }
}

