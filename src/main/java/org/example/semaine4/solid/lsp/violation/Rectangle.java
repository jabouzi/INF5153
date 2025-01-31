package org.example.semaine4.solid.lsp.violation;

// Classe Rectangle
public class Rectangle implements Forme {
    protected int largeur, hauteur;

    public Rectangle(int largeur, int hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public int getLargeur() {
        return largeur;
    }

    public int getHauteur() {
        return hauteur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    @Override
    public int calculerAire() {
        return largeur * hauteur;
    }
}
