package org.example.semaine4.solid.lsp.solution.ex2;

// Classe Rectangle
class Rectangle extends Quadrilatere {
    public Rectangle(int largeur, int hauteur) {
        super(largeur, hauteur);
    }

    @Override
    public int calculerAire() {
        return largeur * hauteur;
    }

    public void definirLargeur(int largeur) {
        this.largeur = largeur;
    }

    public void definirHauteur(int hauteur) {
        this.hauteur = hauteur;
    }
}
