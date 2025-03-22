package org.example.semaine9.state.example2;

class EtatSansPiece implements EtatDistributeur {
    private Distributeur distributeur;

    public EtatSansPiece(Distributeur distributeur) {
        this.distributeur = distributeur;
    }

    @Override
    public void insererPiece() {
        System.out.println("Piece inseree.");
        distributeur.setEtat(new EtatAvecPiece(distributeur));
    }

    @Override
    public void selectionnerProduit() {
        System.out.println("Inserez une piece d'abord.");
    }
}
