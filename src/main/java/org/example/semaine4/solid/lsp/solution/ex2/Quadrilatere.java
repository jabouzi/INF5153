package org.example.semaine4.solid.lsp.solution.ex2;

// Classe de base
abstract class Quadrilatere {
    protected int largeur;
    protected int hauteur;

    public Quadrilatere(int largeur, int hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public abstract int calculerAire();
}

