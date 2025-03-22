package org.example.semaine9.chain_of_responsability.example2;

class GestionnaireMoyennesPieces extends GestionnaireMonnaie {
    @Override
    public void traiterPiece(int valeur) {
        if (valeur <= 50) {
            System.out.println("Piece de " + valeur + " cents traitee par le tube pour pieces moyennes.");
        } else if (suivant != null) {
            suivant.traiterPiece(valeur);
        }
    }
}
