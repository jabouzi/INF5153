package org.example.semaine7.chain_of_responsability.example2;

// Utilisation
public class ChainOfResponsabilityExample {
    public static void main(String[] args) {
        GestionnaireMonnaie petitesPieces = new GestionnairePetitesPieces();
        GestionnaireMonnaie moyennesPieces = new GestionnaireMoyennesPieces();
        GestionnaireMonnaie grossesPieces = new GestionnaireGrossesPieces();

        petitesPieces.setSuivant(moyennesPieces);
        moyennesPieces.setSuivant(grossesPieces);

        petitesPieces.traiterPiece(5);   // Petites pieces
        petitesPieces.traiterPiece(25);  // Pieces moyennes
        petitesPieces.traiterPiece(100); // Grosses pieces
    }
}
