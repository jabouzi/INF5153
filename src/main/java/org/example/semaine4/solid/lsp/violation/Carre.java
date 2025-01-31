package org.example.semaine4.solid.lsp.violation;

// Classe Carré
public class Carre extends Rectangle {

    public Carre(int cote) {
        super(cote, cote);
    }

    @Override
    public void setLargeur(int largeur) {
        super.setLargeur(largeur);
        super.setHauteur(largeur);
    }

    @Override
    public void setHauteur(int hauteur) {
        super.setHauteur(hauteur);
        super.setLargeur(hauteur);
    }
}
