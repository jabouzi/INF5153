package org.example.semaine4.solid.lsp.solution.ex1;

// Classe Carré
public class Carre implements Forme {
    private int cote;

    public Carre(int cote) {
        this.cote = cote;
    }

    public int getCote() {
        return cote;
    }

    public void setCote(int cote) {
        this.cote = cote;
    }

    @Override
    public int calculerAire() {
        return cote * cote;
    }
}
