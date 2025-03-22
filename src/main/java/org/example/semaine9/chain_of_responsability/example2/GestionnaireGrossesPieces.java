package org.example.semaine9.chain_of_responsability.example2;

class GestionnaireGrossesPieces extends GestionnaireMonnaie {
    @Override
    public void traiterPiece(int valeur) {
        System.out.println("Piece de " + valeur + " cents traitee par le tube pour grosses pieces.");
    }
}
