package org.example.semaine7.state.example2;

class Distributeur {
    private EtatDistributeur etat;

    public Distributeur() {
        this.etat = new EtatSansPiece(this);
    }

    public void setEtat(EtatDistributeur etat) {
        this.etat = etat;
    }

    public void insererPiece() {
        etat.insererPiece();
    }

    public void selectionnerProduit() {
        etat.selectionnerProduit();
    }
}

