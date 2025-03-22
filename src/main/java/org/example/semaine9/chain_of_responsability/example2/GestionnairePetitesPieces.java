package org.example.semaine9.chain_of_responsability.example2;

class GestionnairePetitesPieces extends GestionnaireMonnaie {
    @Override
    public void traiterPiece(int valeur) {
        if (valeur <= 10) {
            System.out.println("Piece de " + valeur + " cents traitee par le tube pour petites pieces.");
        } else if (suivant != null) {
            suivant.traiterPiece(valeur);
        }
    }
}
