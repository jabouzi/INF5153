package org.example.semaine4.solid.lsp.solution.ex2;

// Classe Carré
class Carre extends Quadrilatere {
    public Carre(int cote) {
        super(cote, cote);
    }

    @Override
    public int calculerAire() {
        return largeur * hauteur; // largeur == hauteur pour un carré
    }

    public void definirCote(int cote) {
        this.largeur = cote;
        this.hauteur = cote;
    }
}
