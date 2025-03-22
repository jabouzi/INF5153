package org.example.semaine9.state.example2;

// Utilisation
public class StateExample {
    public static void main(String[] args) {
        Distributeur distributeur = new Distributeur();
        distributeur.selectionnerProduit();
        distributeur.insererPiece();       // Piece inseree.
        distributeur.selectionnerProduit(); // Produit selectionne.
        distributeur.selectionnerProduit();
    }
}
