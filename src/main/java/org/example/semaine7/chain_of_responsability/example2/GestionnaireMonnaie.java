package org.example.semaine7.chain_of_responsability.example2;

abstract class GestionnaireMonnaie {
    protected GestionnaireMonnaie suivant;

    public void setSuivant(GestionnaireMonnaie suivant) {
        this.suivant = suivant;
    }

    public abstract void traiterPiece(int valeur);
}

