package org.example.semaine9.state.example2;

class EtatAvecPiece implements EtatDistributeur {
    private Distributeur distributeur;

    public EtatAvecPiece(Distributeur distributeur) {
        this.distributeur = distributeur;
    }

    @Override
    public void insererPiece() {
        System.out.println("Vous avez deja insere une piece.");
    }

    @Override
    public void selectionnerProduit() {
        System.out.println("Produit selectionne.");
        distributeur.setEtat(new EtatSansPiece(distributeur));
    }
}
